package section7;

import java.util.Scanner;

public class exam2 {

    private static int[] solution(int input1, int[] input2) {
        //int[] answer = new int[input1];

        for (int i=0; i < input1; i++) {
            for (int j=0; j < input1-i-1; j++) {
                if (input2[j] > input2[j+1]) {
                    int tmp = input2[j];
                    input2[j] = input2[j+1];
                    input2[j+1] = tmp;
                }
            }
        }

        return input2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2 = new int[input1];
        for(int i=0; i < input1; i++) {
            input2[i] = in.nextInt();
        }

        for (int i : solution(input1, input2)) {
            System.out.print(i + " ");
        }
    }

}
