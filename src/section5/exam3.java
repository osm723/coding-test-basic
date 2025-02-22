package section5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam3 {

    private static ArrayList<Integer> solution(int length, int range, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < range-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (int rt=range-1; rt < length; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());

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

        for (Integer i: solution(input1, input2, input3)) {
            System.out.print(i +" ");
        }
    }

}
