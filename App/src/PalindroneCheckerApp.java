import java.util.*;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // Insert characters into LinkedList
        for(char c : input.toCharArray()){
            list.add(c);
        }

        boolean isPalindrome = true;

        while(list.size() > 1){

            char first = list.removeFirst();
            char last = list.removeLast();

            if(first != last){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}