package baekjoon.class2;

import java.io.IOException;

public class BaekJoon1436_2 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int series = readInt();
        int title = 666, count = 1;
        while (series != count)
        {
            if (has666(++title)) count++;
        }

        System.out.println(title);
    }

    private static boolean has666(int number) {
        while (number >= 666)
        {
            if (number % 1000 == 666) return true;
            number /= 10;
        }

        return false;
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) != ASCII_ENTER)
            {
                // sum = sum * 10 + (asciiCode - 48);
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
