package section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam3_timeLimit {

    private static String solution(int input1, int input2, int[] input3) {
        String answer = "";
        int length = input1;
        int range = input2;
        int[] arr = input3;

        for (int i=0; i < length-range+1; i++) {
            Map<Integer,Integer> map = new HashMap<>();
            for (int j=i; j < range+i; j++) {
                int num = arr[j];
                Integer i1 = map.getOrDefault(arr[j], 0);
                map.put(num, ++i1);
            }
            answer += map.size() + " ";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] input3 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input3[i] = in.nextInt();
        }

        System.out.println(solution(input1, input2, input3));
    }

}
