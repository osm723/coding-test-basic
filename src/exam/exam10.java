package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam10 {

    private static String solution(String input1, String input2) {
        String answer = "";
        List<Integer> intList = new ArrayList<>();

        char[] charArray = input1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == input2.charAt(0)) {
                intList.add(i);
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            int min = charArray.length;
            for (Integer integer : intList) {
                int t = integer - i;
                if (t < 0 ) {
                    t *= -1;
                }
                if (min > t) {
                    min = t;
                }
            }
            answer += min + " ";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1= in.next();
        String input2 = in.next();

        System.out.println(solution(input1, input2));
    }

}
