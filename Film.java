import java.io.*;
class Film implements Serializable {
private String name;
private String genre;
private int release;
private String actor;

public Film (String n, String g, int r, String a) {
name = n;
genre = g;
release = r;
actor = a;
}

public Film ( Film F) {
this(F.getName(), F.getGenre(), F.getRelease(), F.getActor());
}

public String getName() {
return name; }

public String getGenre() {
return genre; }

public int getRelease() {
return release; }

public String getActor() {
return actor; }

public String toString () {
return " \n Film Name: "+name+"    Genre: "+genre+"    Release Year: "+release+"    Actor: "+actor;
}

}