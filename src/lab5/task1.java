package lab5;

class task1 {
    public static void main(String [] args){
        task1 pn = new task1();
        if(pn.isPalindrome("NikitaatikiN")){
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }
    public boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
