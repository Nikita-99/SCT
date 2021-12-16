package lab5;

public class task7 {
    public static void  main (String [] args) {
        String str1 = "Кузнецов";
        String str2 = "Никита";
        CharSequence sr = "Никита";
        System.out.println (str1 + " = " + sr + "? " + str1.contentEquals (sr));
        System.out.println (str2 + " = " + sr + "? " + str2.contentEquals (sr));
    }
}
