package enumeration_may15;

enum Movie {
Pathaan, sir, Hit, Geme_over, Lost;
}
public class EnumTest2 {
 public static void main(String[] args) {
 System.out.println(EnumTest2.getMovie(2));
 }
 public static Movie getMovie(String s) {
 return Enum.valueOf(Movie.class, s.toLowerCase());
 }
 public static Movie getMovie(int n){
 return Movie.values()[n];
 }
}
