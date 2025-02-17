package exam;

import java.util.Scanner;

public class exam5 {

    private static String solution(String str) {
        String answer = "";

        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = charArray.length-1;

        while (lt < rt) {

            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(charArray);
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();

        System.out.println(solution(input));
    }
}
