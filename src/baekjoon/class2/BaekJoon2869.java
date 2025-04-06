package baekjoon.class2;

import java.io.IOException;

public class BaekJoon2869 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int up = readInt();
        int down = readInt();
        int height = readInt();

//        System.out.println(((height - up) + (up - down - 1)) / (up - down) + 1);
        System.out.println(((height - down) + (up - down - 1)) / (up - down));
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) > ASCII_INPUT)
            {
                // sum = sum * 10 + asciiCode - 48;
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
