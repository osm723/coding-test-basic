package section2;

import java.util.Scanner;

public class exam6 {

    private static String solution(String str) {
        String answer = "";

        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length; i++) {
            char t = charArray[i];
            if (answer.indexOf(t, i) == answer.lastIndexOf(t, i)) {
                answer += String.valueOf(t);
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
