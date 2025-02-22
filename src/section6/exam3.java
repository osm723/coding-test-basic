package section6;

import java.util.Scanner;
import java.util.Stack;

public class exam3 {

    private static int solution(int input1, int[][] input2Arr, int input3, int[] input4Arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int k=0; k < input3; k++) {
            for (int i=0; i < input1; i++) {
                int i2 = input2Arr[i][input4Arr[k]-1];
                if (i2 != 0) {
                    input2Arr[i][input4Arr[k]-1] = 0;
                    if (!stack.isEmpty() && stack.peek() == i2) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(i2);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[][] input2Arr = new int[input1][input1];
        for (int i=0; i < input1; i++) {
            for (int j=0; j < input1; j++) {
                input2Arr[i][j] = in.nextInt();
            }
        }
        int input3 = in.nextInt();
        int[] input4Arr = new int[input3];
        for (int k=0; k < input3; k++) {
            input4Arr[k] = in.nextInt();
        }

        System.out.print(solution(input1, input2Arr, input3, input4Arr));
    }

}
