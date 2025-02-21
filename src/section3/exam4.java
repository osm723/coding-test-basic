package section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam4 {

    private static String solution(int input1) {
        String answer = "1 1 ";
        List<Integer> intList = new ArrayList<>();
        intList.add(0,1);
        intList.add(1,1);

        for (int i=0; i < input1-2; i++) {
            int t1 = intList.get(i);
            int t2 = intList.get(i+1);
            int t3 = t1+t2;
            intList.add(i+2, t3);
            answer += t3 + " ";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1= in.nextInt();

        System.out.println(solution(input1));
    }
}
