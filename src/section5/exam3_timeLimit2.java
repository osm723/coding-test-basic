package section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam3_timeLimit2 {

    private static String solution(int input1, int input2, int[] input3) {
        String answer = "";
        int length = input1;
        int range = input2;
        int lt = 0;
        int[] arr = input3;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < range-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (int rt=range-1; rt < length; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer += map.size() + " ";

            map.put(arr[lt], map.get(arr[lt])-1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
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
