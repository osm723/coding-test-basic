package section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam4_answer {

    private static List<String> solution(String[] strArray) {
        List<String> answer = new ArrayList<>();

        for (String str : strArray) {
            StringBuilder stringBuilder = new StringBuilder(str);
            answer.add(stringBuilder.reverse().toString());
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] strArray = new String[num];
        for (int i=0; i<num; i++) {
            strArray[i] = in.next();
        }

        for (String str : solution(strArray)) {
            System.out.println(str);
        }

    }


}
