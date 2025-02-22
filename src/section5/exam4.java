package section5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam4 {

    private static int solution(String input1, String input2) {
        int answer = 0;
        char[] arry1 = input1.toCharArray();
        char[] arry2 = input2.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int initLength = input2.length()-1;
        int lt = 0;

        for (int i=0; i < initLength; i++) {
            map1.put(arry1[i], map1.getOrDefault(arry1[i], 0)+1);
        }

        for (int i=0; i < input2.length(); i++) {
            map2.put(arry2[i], map2.getOrDefault(arry2[i], 0)+1);
        }

        for (int rt=initLength; rt < input1.length(); rt++) {
            //더하기
            map1.put(arry1[rt], map1.getOrDefault(arry1[rt], 0)+1);

            //비교
            if (map1.size() == map2.size()) {
                if (map2.equals(map1)) {
                    answer++;
                }
//                boolean flag = true;
//                for (Character ch : map1.keySet()) {
//
//                    if(!map2.containsKey(ch)) {
//                        flag = false;
//                        break;
//                    }
//                }
//                if (flag) {
//                    answer++;
//                }
            }

            //빼기
            map1.put(arry1[lt], map1.get(arry1[lt])-1);
            if (map1.get(arry1[lt]) == 0) {
                map1.remove(arry1[lt]);
            }
            lt++;
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        System.out.print(solution(input1, input2));
    }
}
