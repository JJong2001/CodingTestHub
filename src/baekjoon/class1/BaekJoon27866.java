package baekjoon.class1;

import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

/**
 * 문제
 * 단어 S와 정수 i가 주어졌을 때,
 * S의 i번째 글자를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
 * 단어의 길이는 최대 1,000이다. 둘째 줄에 정수 i가 주어진다. (1 <= i <= S)
 */
public class BaekJoon27866 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) throws IOException {
        List<Character> characters = new LinkedList<>();

        char ch;
        while ((ch = (char) System.in.read()) != ASCII_ENTER)
        {
            characters.add(ch);
        }

        int asciiCode, sum = 0;
        while ((asciiCode = System.in.read()) != ASCII_ENTER)
        {
            sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48)
        }

        System.out.println(characters.get(sum - 1));
    }
}
