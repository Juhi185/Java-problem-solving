import java.util.*;

public class Solution {

    public static ArrayList<String> smallestSubsequences(String s) {
        int n = s.length();
        ArrayList<String> result = new ArrayList<>();

        for (int length = 1; length <= n; length++) {
            Deque<Character> stack = new ArrayDeque<>();
            int remaining = n; // Total characters left to process
            
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                // Remove characters from the stack if:
                // 1. The stack is not empty.
                // 2. The top character of the stack is greater than the current character.
                // 3. There are enough characters remaining to form the required subsequence.
                while (!stack.isEmpty() && stack.peekLast() > c && stack.size() + (remaining - 1) > length) {
                    stack.pollLast();
                }

                // Add the current character to the stack if the stack has space.
                if (stack.size() < length) {
                    stack.addLast(c);
                }
                remaining--;
            }

            // Convert the stack to a string and add it to the result.
            StringBuilder subsequence = new StringBuilder();
            for (Character ch : stack) {
                subsequence.append(ch);
            }
            result.add(subsequence.toString());
        }

        return result;
    }

    public static void main(String[] args) {
        String s2 = "go";
        System.out.println(smallestSubsequences(s2)); // Output: ["g", "go"]
    }
}