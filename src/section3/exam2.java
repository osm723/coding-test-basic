package section3;

import java.util.Scanner;

public class exam2 {

    public class Main {

        private static int solution(int[] intArray) {
            int cnt = 1;
            int max = intArray[0];

            for (int i=1; i < intArray.length; i++) {
                if (max < intArray[i]) {
                    max = intArray[i];
                    cnt++;
                }
            }

            return cnt;
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int input1= in.nextInt();
            int[] array = new int[input1];
            for (int i=0; i < input1; i++) {
                array[i] = in.nextInt();
            }

            System.out.println(solution(array));

        }
    }

}
