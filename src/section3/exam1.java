package section3;

import java.util.ArrayList;
import java.util.Scanner;

public class exam1 {

    public class Main {

        private static ArrayList<Integer> solution(int input1, int[] intArray) {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(intArray[0]);

            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > intArray[i-1]) {
                    integers.add(intArray[i]);
                }
            }
            return integers;
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int input1= in.nextInt();
            int[] intArray = new int[input1];
            for (int i=0; i < input1; i++) {
                intArray[i] = in.nextInt();
            }

            for (int i : solution(input1, intArray)) {
                System.out.print(i +" ");
            }
        }
    }

}
