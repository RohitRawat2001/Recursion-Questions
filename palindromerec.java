public class palindromerec {
     
    static boolean palindrome(String s,int i , int j){

        if(i>j){
            return true;
        }
       if(s.charAt(i) !=s.charAt(i)){
        return false;
       }
       else{
        return palindrome(s, i+1, j-1);
       }

    }

    public static void main(String[] args) {
        String s="asdef";
        System.out.println();

       boolean ispalindrome= palindrome(s,0,s.length()-1);


       if(ispalindrome){
        System.out.println("It is palindrome");
       }
       else{
        System.out.println("It is not palidrome");
       }


    }
    
}
