package lab5;

public class task5 {
    public static void main(String[] args)
    {
        String str1 ="KUZNETSOV";
        String str2 ="kuznets";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" + " < " + "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" + " = " + "\"" + str2 + "\"");
        }
        else
        {
            System.out.println("\"" + str1 + "\"" + " > " + "\"" + str2 + "\"");
        }
    }
}
