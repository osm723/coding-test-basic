package section3;

import java.util.Scanner;

public class exam12 {

    private static int solution(int input1, int input2, int[] inputArr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < inputArr.length; rt++) {
            if (inputArr[rt] == 0) {
                cnt++;
            }

            while (cnt > input2) {
                if (inputArr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArr = new int[input1];
        for (int i=0; i < input1; i++) {
            inputArr[i] = in.nextInt();
        }

        System.out.print(solution(input1, input2, inputArr));
    }

}
