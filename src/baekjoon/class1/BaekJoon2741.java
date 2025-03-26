package baekjoon.class1;

import java.io.IOException;

public class BaekJoon2741 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int number = readInt();
        if (number < 1 || number > 100000) return;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try {
            while ((asciiCode = System.in.read()) != ASCII_ENTER) {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48)
            }
        } catch (IOException ignored) {}

        return sum;
    }
}
