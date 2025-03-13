package section11;

import java.util.Scanner;

public class exam1 {

    static int max = 0;
    static int answer = 0;

    private static void DFS(int sum) {
        if (sum == max) {
            answer++;
        } else {
            if (sum+1 <= max) {
                DFS(sum+1);
            }
            if (sum+2 <= max) {
                DFS(sum+2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        max = in.nextInt();

        DFS(0);
        System.out.println(answer);
    }

}
