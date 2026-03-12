import java.util.*;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for(char c : input.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1){

            char first = deque.removeFirst();
            char last = deque.removeLast();

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