package exam;

import java.util.Scanner;

public class exam8 {

    private static String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String reverseStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reverseStr)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solution(input));
    }

}
