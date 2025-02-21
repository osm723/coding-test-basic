package section3;

import java.util.Scanner;

public class exam5_ex {

    private static int solution(int input1) {
        int answer = 0;
        int num = 0;

        for (int i=2; i < input1; i++) {
            for (int j=2; j <= i; j++) {

                if (i%j == 0) {
                    num++;
                }
            }
            if (num == 1) {
                answer++;
            }
            num=0;
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1= in.nextInt();

        System.out.println(solution(input1));
    }

}
