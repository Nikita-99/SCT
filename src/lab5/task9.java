package lab5;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        System.out.print("Введите первую строку: ");
        Scanner console = new Scanner (System.in);
        String s = console.next();
        System.out.print("Введите вторую строку: ");
        String t = console.next();
        System.out.println(s.equals(t));
    }
}
