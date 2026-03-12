import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray())
            stack.push(c);

        String reversed = "";

        while(!stack.isEmpty())
            reversed += stack.pop();

        return input.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray())
            deque.addLast(c);

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy;

        if(choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        if(strategy.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}