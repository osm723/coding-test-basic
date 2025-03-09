package section9;

import java.util.Scanner;

public class exam6 {

    static int[] arr;
    static int[] ch;
    static int[] answer;
    static int totalCnt;
    static int maxCnt;

    private static void DFS(int L) {
        if (L == maxCnt) {
            for (int i : answer) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i=0; i< arr.length; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    answer[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        totalCnt = input1;
        maxCnt = input2;
        arr = new int[totalCnt];
        ch = new int[totalCnt];
        answer = new int[maxCnt];
        for (int i=0; i < input1; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0);
    }

}
