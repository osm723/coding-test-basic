package section7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class exam6 {

    private static List<Integer> solution(int input1, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (Integer i : arr) {
            list1.add(i);
            list2.add(i);
        }

        list1.sort(Integer::compareTo);

        for (int i = 0; i < input1; i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt()+1;
        int[] input2Arr = new int[input1];
        input2Arr[0] = 0;
        for (int i=1; i<input2Arr.length; i++) {
            input2Arr[i] = in.nextInt();
        }

        for (int i : solution(input1, input2Arr)) {
            System.out.print(i + " ");
        }
    }

}
