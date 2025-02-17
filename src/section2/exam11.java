package section2;

import java.util.Scanner;

public class exam11 {

    private static String solution(String input1) {
        String answer = "";
        String input1Plus = input1 + " ";
        char[] charArray = input1Plus.toCharArray();
        int num = 0;

        for (int i=0; i < input1Plus.length()-1; i++) {

            if (charArray[i] == charArray[i+1]) {
                num++;
            } else {
                answer += charArray[i];
                if (num != 0) {
                    answer += ++num;
                }
                num = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1= in.nextLine();

        System.out.println(solution(input1));
    }

}
