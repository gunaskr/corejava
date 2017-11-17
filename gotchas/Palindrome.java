public class Palindrome {
    public static void main(String... args){
        final String input = args[0];
        for (int i = 0; i < input.length()/2 ; i++) {
            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                System.out.println("not a palindrome");
                break;
            }else if(i == (input.length()/2)-1){
                System.out.println("palindrome");
            }
        }
    }
}