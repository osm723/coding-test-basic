package section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam2 {

    private static String solution(String input1, String input2) {
        String answer = "YES";
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        char[] array1 = input1.toCharArray();
        char[] array2 = input2.toCharArray();

        if (array1.length != array2.length) {
            return "NO";
        }

        for (int i = 0; i < array1.length; i++) {
            String ch = String.valueOf(array1[i]);
            Integer i1 = map1.getOrDefault(ch, 0);
            map1.put(ch,++i1);
        }

        for (int j = 0; j < array2.length; j++) {
            String ch = String.valueOf(array2[j]);
            Integer i2 = map2.getOrDefault(ch, 0);
            map2.put(ch, ++i2);
        }

        for (Map.Entry<String,Integer> set : map1.entrySet()) {
            String key = set.getKey();
            if (set.getValue() != map2.getOrDefault(key, 0)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        System.out.println(solution(input1, input2));
    }

}
