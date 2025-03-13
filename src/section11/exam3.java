package section11;

import java.util.Arrays;
import java.util.Scanner;

public class exam3 {

    static int[] arr;
    static int[] dy;

    private static int solution(int n) {
        dy[0] = 1;

        for (int i=1; i < n; i++) {
            int curVal = arr[i];
            for (int j=0; j < i; j++) {
                int preVal = arr[j];
                if (preVal < curVal) {
                    if (dy[i] < dy[j]+1) {
                        dy[i] = dy[j]+1;
                    }
                }
            }

            if (dy[i] == 0) {
                dy[i] = 1;
            }
        }

        return Arrays.stream(dy).max().getAsInt();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        arr = new int[input1];
        dy = new int[input1];
        for (int i=0; i < input1; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(input1));
    }

}
