import java.util.*;

public class PalindroneCheckerApp {

    // Simple Palindrome Check
    static boolean simpleCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while(start < end) {
            if(input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // Stack Based Check
    static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray())
            stack.push(c);

        String reversed = "";

        while(!stack.isEmpty())
            reversed += stack.pop();

        return input.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        long startTime;
        long endTime;

        // Simple Method
        startTime = System.nanoTime();
        boolean result1 = simpleCheck(input);
        endTime = System.nanoTime();

        long simpleTime = endTime - startTime;

        // Stack Method
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();

        long stackTime = endTime - startTime;

        System.out.println("\nSimple Method Result: " + result1);
        System.out.println("Simple Method Time: " + simpleTime + " ns");

        System.out.println("\nStack Method Result: " + result2);
        System.out.println("Stack Method Time: " + stackTime + " ns");

        sc.close();
    }
}