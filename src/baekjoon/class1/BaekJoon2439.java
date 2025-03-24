package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 */
public class BaekJoon2439 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int length = readInt();
        if (length < 0 || length > 100) return;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                sb.append(' ');
            }
            for (int j = 0; j <= i; j++)
            {
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static int readInt() {
        int c, n = 0;
        try {
            while ((c = System.in.read()) > ASCII_INPUT) {
                n = (n << 3) + (n << 1) + (c & 15); // n = n * 10 + (c - 48)
            }
        } catch (IOException ignored) {}

        return n;
    }
}
