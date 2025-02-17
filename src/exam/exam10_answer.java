package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam10_answer {

    private static String solution(String input1, String input2) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = input1.toCharArray();
        int t = charArray.length;
        int p = charArray.length;
        List<Integer> ltList = new ArrayList<>();
        List<Integer> rtList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == input2.charAt(0)) {
                t = 0;
            } else {
                t++;
            }
            ltList.add(t);
        }

        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.println("i=" + i);
            if (charArray[i] == input2.charAt(0)) {
                p = 0;
            } else {
                p++;
            }
            rtList.add(p);
        }

        for (int i=0; i < charArray.length; i++) {
            if (ltList.get(i) > rtList.get(charArray.length-i-1)) {
                list.add(rtList.get(charArray.length - i - 1));
                answer.append(rtList.get(charArray.length - i - 1)).append(" ");
            } else {
                answer.append(ltList.get(i)).append(" ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1= in.next();
        String input2 = in.next();

        System.out.println(solution(input1, input2));
    }

}
