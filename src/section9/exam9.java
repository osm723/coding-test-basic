package section9;

import java.util.Scanner;

public class exam9 {

    static int[] choose;
    static int totalCnt;
    static int chooseCnt;

    private static void DFS(int L, int s) {
        if (L == chooseCnt) {
            for (int i : choose) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i=s; i < totalCnt+1; i++) {
                choose[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input1 = in.nextInt();
        int input2 = in.nextInt();
        choose = new int[input2];
        totalCnt = input1;
        chooseCnt = input2;

        DFS(0, 1);
    }


}
