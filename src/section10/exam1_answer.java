package section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam1_answer {

    private static void solution(int len, List<Body> body) {
        int cnt = 0;
        int baseWeigh = 0;
        for (Body b : body) {
            if (baseWeigh < b.getW()) {
                baseWeigh = b.getW();
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        List<Body> body = new ArrayList<>();

        for (int i=0; i < input1; i++) {
            int h = in.nextInt();
            int w = in.nextInt();
            body.add(i, new Body(h, w));
        }

        Collections.sort(body, Collections.reverseOrder());

//        for (Body body1 : body) {
//            System.out.println(body1.getH() + ":" + body1.getW());
//        }

        solution(input1,body);

    }

}
