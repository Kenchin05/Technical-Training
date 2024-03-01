import java.util.Scanner;

public class InfiniteString {

    static long countAsInInfiniteString(String s, long n) {
        long repeatedCount = n / s.length();
        long remainderCount = n % s.length();

        long totalCount = repeatedCount * countAsInString(s) + countAsInSubstring(s, remainderCount);

        return totalCount;
    }

    static long countAsInString(String s) {
        long count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

    static long countAsInSubstring(String s, long length) {
        long count = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the infinite string (e.g., abc): ");
        String infiniteString = scanner.next();

        System.out.print("Enter the value of n: ");
        long n = scanner.nextLong();

        long result = countAsInInfiniteString(infiniteString, n);

        System.out.println("Number of 'a's in the first " + n + " letters: " + result);

        scanner.close();
    }
}
