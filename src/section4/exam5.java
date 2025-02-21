package section4;

import java.util.Scanner;

public class exam5 {

    public class Main {

        private static int solution(int input1) {
            int answer = 0;
            int lt = 1;
            int sum = lt;
            int[] arr = new int[input1+1];
            for (int i = 1; i < input1+1; i++) {
                arr[i] = i;
            }

            for (int rt = 2; rt < arr.length/2+1; rt++) {
                //System.out.println("arr[rt]="+arr[rt]);
                sum+= arr[rt];
                //System.out.println("sum="+sum);

                if (sum == input1) {
                    answer++;
                } else if (sum > input1) {
                    for (int j = 0; j < arr.length/2+1; j++) {
                        sum -= arr[lt];
                        lt++;
                        if (sum == input1) {
                            answer++;
                        } else if (sum < input1) {
                            break;
                        }
                    }
                }
            }

            return answer;
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int input1 = in.nextInt();

            System.out.println(solution(input1));
        }
    }

}
