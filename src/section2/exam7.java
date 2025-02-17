package section2;

import java.util.Scanner;

public class exam7 {

    private static String solution(String str) {
        String answer = "YES";

        String upStr = str.toUpperCase();
        char[] charArray = upStr.toCharArray();
        int lt = 0;
        int gt = charArray.length-1;

        while (lt < gt) {
            if (charArray[lt] == charArray[gt]) {
                lt++;
                gt--;
            } else {
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
