package lab5;

public class task8 {
    public static void main(String args[]){
        String str = "Никита Кузнецов";
        boolean str1 = str.endsWith("Кузнецов");
        boolean str2 = str.endsWith("Иванов");
        System.out.println("Строка: "+"'"+str +"'"+ " заканчивается на 'лучший!': " + str1);
        System.out.println("Строка: "+"'"+str +"'"+ " заканчивается на 'Не очень': " + str2);
    }
}
