package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
 * 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 *
 * 입력
 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
 * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 */
public class BaekJoon1152 {
    private static final int ASCII_ENTER = 10;
    private static final int ASCII_SPACE = 32;

    public static void main(String[] args) {
        int inputAsciiCode;
        int prevAsciiCode = ASCII_SPACE;
        int wordCount = 0;

        try {
            while ((inputAsciiCode = System.in.read()) != ASCII_ENTER)
            {
                if (inputAsciiCode == ASCII_SPACE && prevAsciiCode != ASCII_SPACE) wordCount++;
                prevAsciiCode = inputAsciiCode;
            }
        } catch (IOException ignored) {}

        if (prevAsciiCode != ASCII_SPACE) wordCount++;
        System.out.println(wordCount);
    }
}
