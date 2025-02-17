package section2;

import java.util.Scanner;

public class exam7_answer {

    private static String solution(String str) {
        String answer = "YES";

        String upStr = str.toUpperCase();
        char[] charArray = upStr.toCharArray();
        int length = charArray.length;

        for (int i=0; i < length/2; i++) {
            if (charArray[i] != charArray[length-i-1]) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();

        System.out.println(solution(input));
    }


}
