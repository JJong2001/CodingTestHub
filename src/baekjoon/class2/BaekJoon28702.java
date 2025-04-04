package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/28702
 */
public class BaekJoon28702 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) throws IOException {
        int[] numbers = { 0, 0, 0 };

        for (int i = 0; i < numbers.length; i++)
        {
            int asciiCode, sum = 0;
            while ((asciiCode = System.in.read()) != ASCII_ENTER)
            {
                if (asciiCode < 65) sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }

            numbers[i] = sum;
        }

        int nextNumber = 0;
        for (int i = numbers.length - 1, j = 1;
             i >= 0;
             i--, j++)
        {
            if (numbers[i] > 0) {
                nextNumber = numbers[i] + j;
                break;
            }
        }

        String str = "";
        if (nextNumber % 3 == 0) str = "Fizz";
        if (nextNumber % 5 == 0) str += "Buzz";

        System.out.println(str.isEmpty() ? nextNumber : str);
    }
}
