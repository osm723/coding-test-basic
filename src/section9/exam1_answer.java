package section9;

import java.util.Arrays;
import java.util.Scanner;

public class exam1_answer {

    static int maxLevel;

    static String answer = "NO";

    static int total = 0;

    static boolean flag = false;

    private static void DFS(int L, int sum, int[] arr) {
        if (flag) {
            return;
        }

        if (sum > total/2) {
            return;
        }

        if (L == maxLevel) {
            if (total-sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L+1, sum+ arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input2 = in.nextInt();
        maxLevel = input2;
        int[] arr = new int[input2];
        for (int i=0; i < input2; i++) {
            arr[i] = in.nextInt();
        }
        total = Arrays.stream(arr).sum();

        DFS(0, 0, arr);
        System.out.println(answer);
    }

}
