package section4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam1_answer {

    private static List<Integer> solution(int[] input1Arr, int[] input2Arr) {

        List<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < input1Arr.length && p2 < input2Arr.length) {
            if (input1Arr[p1] < input2Arr[p2]) {
                list.add(input1Arr[p1]);
                p1++;
            } else {
                list.add(input2Arr[p2]);
                p2++;
            }
        }
        while (p1 < input1Arr.length) {
            list.add(input1Arr[p1]);
            p1++;
        }
        while (p2 < input2Arr.length) {
            list.add(input2Arr[p2]);
            p2++;
        }

        return list;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input1Arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            input1Arr[i] = in.nextInt();
        }

        int input2 = in.nextInt();
        int[] input2Arr = new int[input2];
        for (int i = 0; i < input2; i++) {
            input2Arr[i] = in.nextInt();
        }

        for (int i : solution(input1Arr, input2Arr)) {
            System.out.print(i + " ");
        }
    }

}
