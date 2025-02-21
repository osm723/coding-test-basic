package section3;

import java.util.Scanner;

public class exam5 {

    private static int solution(int num) {
        int answer = 0;
        int[] charArray = new int[num+1];

        for (int i=2; i <= num; i++) {
            if (charArray[i] == 0) {
                answer++;
                for (int j=i; j <= num; j=j+i) {
                    charArray[j] = 1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1= in.nextInt();

        System.out.println(solution(input1));
    }

}
