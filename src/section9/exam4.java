package section9;

import java.util.Scanner;

public class exam4 {

    static int[] arr;
    static int totalCnt;
    static int maxCnt;

    private static void DFS(int L) {
        if (L == maxCnt) {
            for (int i1 : arr) {
                System.out.print(i1 + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i=1; i < totalCnt+1; i++) {
                arr[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        totalCnt = input1;
        maxCnt = input2;
        arr = new int[maxCnt];

        DFS(0);
    }

}
