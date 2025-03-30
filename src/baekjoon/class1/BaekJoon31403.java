package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * JavaScript에서 +, -은 수에 대해서는 일반적인 의미의 덧셈 뺄셈의 의미를 가지고 있습니다.
 * 하지만 문자열에 대해서 +는 두 문자열을 이어붙이라는 의미이고,
 * -는 양쪽 문자열을 수로 해석한 이후에 빼라는 의미입니다.
 * A, B, C를 각각 수와 문자열로 생각했을 때 A + B - C를 출력하세요.
 *
 * 입력
 * 첫 줄에는 정수 A가 주어집니다. (1 <= A <= 1,000)
 * 둘째 줄에는 정수 B가 주어집니다. (1 <= A <= 1,000)
 * 셋째 줄에는 정수 C가 주어집니다. (1 <= A <= 1,000)
 *
 * 주어지는 모든 수는 0으로 시작하지 않는 양의 정수입니다.
 */
public class BaekJoon31403 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int a = readInt();
        int b = readInt();
        int c = readInt();

        System.out.println(
                a + b - c + "\n" +
                (Integer.parseInt("" + a + b) - c)
        );
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) != ASCII_ENTER)
            {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48)
            }
        } catch (IOException ignored) {}

        return sum;
    }
}
