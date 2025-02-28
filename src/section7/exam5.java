package section7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exam5 {

    private static String solution(int input1, int[] arr) {
        String answer = "U";

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input1; i++) {
            set.add(arr[i]);
        }
        if (set.size() != arr.length) {
            answer = "D";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2Arr = new int[input1];
        for (int i=0; i<input2Arr.length; i++) {
            input2Arr[i] = in.nextInt();
        }

        System.out.print(solution(input1, input2Arr));
    }

}
