package baekjoon.class2;

import java.io.IOException;

public class BaekJoon28702_2 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) throws IOException {
        int number = 0;
        for (int i = 0; i < 3; i++)
        {
            int asciiCode, sum = 0;
            while ((asciiCode = System.in.read()) != ASCII_ENTER)
            {
                if (asciiCode < 65) sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }

            if (sum > 0) number = sum;
            else number++;
        }

        number++;
        String str = "";
        if (number % 3 == 0) str = "Fizz";
        if (number % 5 == 0) str += "Buzz";

        System.out.println(str.isEmpty() ? number : str);
    }
}
