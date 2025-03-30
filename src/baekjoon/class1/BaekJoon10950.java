package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
public class BaekJoon10950 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int testCase = readInt();
        do {
            int a = readInt();
            int b = readInt();
            sb.append(a + b).append('\n');

            testCase--;
        } while (testCase > 0);

        System.out.println(sb);
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
