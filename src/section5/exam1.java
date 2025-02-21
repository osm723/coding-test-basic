package section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam1 {

    private static String solution(int length, String vote) {
        String answer = "";
        int max = 0;
        char[] array = vote.toCharArray();
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            String ch = String.valueOf(array[i]);
            Integer i1 = map.getOrDefault(ch, 0);
            map.put(ch,++i1);
        }

        for (Map.Entry<String,Integer> set : map.entrySet()) {
            if (max < set.getValue()) {
                max = set.getValue();
                answer = set.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();

        System.out.println(solution(input1, input2));
    }
}
