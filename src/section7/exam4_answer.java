package section7;

import java.util.Scanner;

public class exam4_answer {

    private static int[] solution(int size, int input2, int[] arr) {
        int[] cache = new int[size];

        for (int x : arr) {
            int pos = -1;

            for(int i=0; i<size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }

            if (pos == -1) {
                for (int i=size-1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            } else {
                for (int i=pos; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArr = new int[input2];

        for (int i=0; i<input2; i++) {
            inputArr[i] = in.nextInt();
        }

        for (int i : solution(input1, input2, inputArr)) {
            System.out.print(i + " ");
        }

    }

}
