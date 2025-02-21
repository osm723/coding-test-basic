package section3;

import java.util.Scanner;

public class exam3 {

    public class Main {

        private static String solution(int input1, int[] arrayA, int[] arrayB) {
            String answer = "";

            for (int i=0; i < input1; i++) {
                if (arrayA[i] == arrayB[i]) {
                    answer = "D";
                }
            }


            return answer;
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int input1= in.nextInt();
            int[] arrayA = new int[input1];
            for (int i=0; i < input1; i++) {
                arrayA[i] = in.nextInt();
            }
            int[] arrayB = new int[input1];
            for (int i=0; i < input1; i++) {
                arrayB[i] = in.nextInt();
            }

            for (int i=0; i < input1; i++) {
                // 1 가위
                // 2 바위
                // 3 보
                // 1 가위 > 2 바위
                // 1 가위 < 3 보
                // 2 바위 < 3 보
                if (arrayA[i] == arrayB[i]) {
                    System.out.println("D");
                } else if (arrayA[i] == 1) {
                    if (arrayB[i] == 3) {
                        System.out.println("A");
                    } else {
                        System.out.println("B");
                    }
                } else if (arrayA[i] == 2) {
                    if (arrayB[i] == 1) {
                        System.out.println("A");
                    } else {
                        System.out.println("B");
                    }
                } else if (arrayA[i] == 3) {
                    if (arrayB[i] == 2) {
                        System.out.println("A");
                    } else {
                        System.out.println("B");
                    }
                }
            }

        }
    }
}
