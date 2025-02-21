package section3;

import java.util.Scanner;

public class exam8 {

    private static int[] solution(int input1, int[] input2) {
        int[] answer = new int[input1];


        for (int i=0; i < input2.length; i++) {
            int rank = 1;
            for (int j=0; j < input2.length; j++) {
                if (input2[i] < input2[j]) {
                    rank++;
                }

//                if (input2[i] == input2[j]) {
//
//                } else if (input2[i] > input2[j]) {
//
//                } else if (input2[i] < input2[j]) {
//                    rank++;
//                }
            }
            answer[i] = rank;
        }



        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1= in.nextInt();
        int[] input2 = new int[input1];
        for (int i=0; i < input1; i++) {
            input2[i] = in.nextInt();
        }

        for (int i : solution(input1, input2)) {
            System.out.print(i + " ");
        }
    }

}
