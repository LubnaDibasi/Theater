import java.io.*;
import java.util.*;

class Theater {
private int thNo;
private String thType;
private int numFilm = 0; //counter 
private Film[] filmsList;

public Theater (int no, String type, int size) {
thNo = no;
thType = type;
filmsList = new Film [size];
}

public boolean addFilm (Film f) {
if (numFilm < filmsList.length) {
filmsList[numFilm++] = f;
return true; }
return false;
}

public void saveFilms (String filename) throws IOException {
File fO = new File(filename);
FileOutputStream fOut = new FileOutputStream (fO);
ObjectOutputStream objOut = new ObjectOutputStream (fOut);

objOut.writeInt(thNo);
objOut.writeInt(numFilm);
objOut.writeObject(filmsList);

objOut.close();

}

public void retrieveFilms (String filename) throws IOException , ClassNotFoundException {
File fI = new File(filename) ; 
FileInputStream fIn = new FileInputStream(fI);
ObjectInputStream objIn = new ObjectInputStream(fIn);

this.thNo = objIn.readInt();
this.numFilm = objIn.readInt() ; 
filmsList = (Film[]) objIn.readObject() ; 

objIn.close();

System.out.println("Theater Number: " + thNo); 
System.out.println("Number Of Films: " + numFilm);
for ( int i=0; i<numFilm; i++)
System.out.println(filmsList[i]);
}

public void classifyByGenre (String genre) throws FileNotFoundException {
String fName = genre+ ".txt"; 

File fO = new File(fName) ; 
FileOutputStream fOut = new FileOutputStream(fO) ; 
PrintWriter PW = new PrintWriter(fOut) ; 

for (int i=0; i<numFilm; i++)
if (filmsList[i].getGenre().equals(genre))
PW.println(filmsList[i].getName() + "    " + filmsList[i].getRelease() + "    " + filmsList[i].getActor()); 

PW.close();}
}
