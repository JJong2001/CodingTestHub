package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 */
public class BaekJoon10869 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int a = readInt();
        int b = readInt();
        System.out.println(
                (a + b) + "\n" +
                (a - b) + "\n" +
                (a * b) + "\n" +
                (a / b) + "\n" +
                (a % b)
        );
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) > ASCII_INPUT)
            {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
