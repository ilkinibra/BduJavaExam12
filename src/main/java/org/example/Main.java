import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (byte type): ");
        byte number = scanner.nextByte();

        boolean isPalindrome = isPalindrome(number);

        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(byte num) {
        String numString = Byte.toString(num);

        int i = 0;
        int j = numString.length() - 1;

        while (i < j) {
            if (numString.charAt(i) != numString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
