package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 *
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
 */
public class BaekJoon8958 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) throws IOException {
        int testCase = readInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            int totalScore = 0;
            int score = 1;

            char c;
            while ((c = (char) System.in.read()) != ASCII_ENTER) {
                if (c == 'O') {
                    totalScore += score;
                    score++;
                }
                else score = 1;
            }

            sb.append(totalScore).append('\n');
        }

        System.out.println(sb);
    }

    private static int readInt() throws IOException {
        int asciiCode, sum = 0;
        while ((asciiCode = System.in.read()) != ASCII_ENTER) {
            sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
        }

        return sum;
    }
}
