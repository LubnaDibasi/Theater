import java.io.*;

public class TheaterTest {
public static void main (String [] args) {

Theater theater = new Theater (4,"Gold", 15); 

theater.addFilm(new Film("Terminal", "Drama", 2004, "Tom Hanks"));
theater.addFilm(new Film("Born a King", "Drama", 2019,"Rawkan binbella"));
theater.addFilm(new Film("Spider-Man", "Action", 2019,"Tom Holland"));
theater.addFilm(new Film("Ben Is Back", "Drama", 2018,"Julia Roberts"));
theater.addFilm(new Film("Wonder Park", "Comedy", 2019,"Sofia Mali"));
theater.addFilm(new Film("Toy Story 3", "Comedy", 2010,"Tom Hanks"));

try {
theater.saveFilms("FilmsInfo.dat"); }

catch(IOException e){
System.out.println("Error, Couldn't Open File To Save Films."); }

         
try {
theater.retrieveFilms("FilmsInfo.dat"); }

catch(ClassNotFoundException e) {
System.out.println("Casting Exception While Reading Films."); }
catch(IOException e) {
System.out.println("Error, Couldn't Open File To Read Films."); }

   
try {
theater.classifyByGenre("Drama"); }

catch(IOException e) {
System.out.println("Error, Genre.txt File."); }

}}