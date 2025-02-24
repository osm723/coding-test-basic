package section5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class exam5 {

    private static int solution(int input1, int input2, int[] arr) {
        int answer = 0;

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < input1; i++) {
            for (int j = i+1; j < input1; j++) {
                for (int k = j+1; k < input1; k++) {
                    treeSet.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        int cnt = 0;
        for (Integer i : treeSet) {
            cnt++;
            if (input2 == cnt) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArray = new int[input1];
        for (int i = 0; i < input1; i++) {
            inputArray[i] = in.nextInt();
        }

        System.out.print(solution(input1, input2, inputArray));
    }

}
