package section2;

import java.util.Scanner;

public class exam12 {

    private static String solution(int input1, String input2) {
        String answer = "";

        for (int i=1; i < input1+1; i++) {
            String substring = input2.substring((i-1) * 7, i * 7);
            String s1 = substring.replaceAll("#", "1");
            String s2 = s1.replaceAll("[*]", "0");

            int i10 = Integer.parseInt(s2, 2);
            answer += (char) i10;
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1= in.nextInt();
        String input2 = in.next();

        System.out.println(solution(input1, input2));
    }

}
