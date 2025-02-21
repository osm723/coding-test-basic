package section4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam1 {

    private static List<Integer> solution(int[] input1Arr, int[] input2Arr) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input1Arr.length; i++) {
            list.add(input1Arr[i]);
        }
        for (int i = 0; i < input2Arr.length; i++) {
            list.add(input2Arr[i]);
        }

        Collections.sort(list);


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
