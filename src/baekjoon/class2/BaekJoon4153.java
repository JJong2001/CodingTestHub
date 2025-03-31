package baekjoon.class2;

import java.io.IOException;

/**
 * 문제
 * 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
 * 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 *
 * 입력
 * 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
 * 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
 */
public class BaekJoon4153 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        while (true)
        {
            int a = readInt();
            int b = readInt();
            int c = readInt();
            if (a + b + c == 0) break;

            if (a > c)
            {
                int temp = a;
                a = c;
                c = temp;
            }
            if (b > c)
            {
                int temp = b;
                b = c;
                c = temp;
            }

            if (a * a + b * b == c * c) sb.append("right").append('\n');
            else sb.append("wrong").append('\n');
        }

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
