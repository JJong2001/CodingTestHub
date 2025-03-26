package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다.
 * 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 */
public class BaekJoon2920 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int size = 8;
        int order = 0;
        for (int i = 1; i <= size; i++) {
            int num = readInt();
            if (num == i) order++;
            else if (num - 1 == size - i) order--;
        }

        System.out.println(
                order == size ? "ascending" :
                order == -size ? "descending" : "mixed"
        );
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try {
            while ((asciiCode = System.in.read()) > ASCII_INPUT) {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48)
            }
        } catch (IOException ignored) {}

        return sum;
    }
}
