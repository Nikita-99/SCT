package lab5;

public class task16 {
    public static boolean firstInLast(String str){
        if (str.length() < 2)
            return false;
        else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        System.out.println("В конце стоят первые два символа? "
                +firstInLast("nikitani"));
    }
}