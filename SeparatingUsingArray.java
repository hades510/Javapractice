 import java.util.Arrays;
import java.util.Scanner;
 

 class IntegerSeparationExample {
    public static int[] separateDigits(int number) {
        String numberString = Integer.toString(number);
        int[] digits = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] separatedDigits = separateDigits(number);
        System.out.println("Separated digits: " + Arrays.toString(separatedDigits));
    }
}

