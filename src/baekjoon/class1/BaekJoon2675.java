package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
 * 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
 */
public class BaekJoon2675 {
    private static final int ASCII_ENTER = 10;
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int testCase = readInt();
        if (testCase < 1 || testCase > 1000) return;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            int repeat = readInt();
            if (repeat < 1 || repeat > 8) return;

            char c;
            try {
                while ((c = (char) System.in.read()) != ASCII_ENTER) {
                    for (int j = 0; j < repeat; j++) sb.append(c);
                }
            } catch (IOException ignored) {}
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try {
            while((asciiCode = System.in.read()) > ASCII_INPUT) {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }
        } catch (IOException ignored) {}

        return sum;
    }
}
