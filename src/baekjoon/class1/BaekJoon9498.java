package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 */
public class BaekJoon9498 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) throws IOException {
        int score = readInt();
        System.out.println(
                score >= 90 ? "A" :
                score >= 80 ? "B" :
                score >= 70 ? "C" :
                score >= 60 ? "D" : "F"
        );
    }

    private static int readInt() throws IOException {
        int asciiCode, sum = 0;
        while ((asciiCode = System.in.read()) != ASCII_ENTER) {
            sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
        }

        return sum;
    }
}
