package section2;

import java.util.Scanner;

public class exam3 {

    private static String solution(String input1) {
        int maxLength = 0;
        String answer = "";
        String[] words = input1.split(" ");

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

}
