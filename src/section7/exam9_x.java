package section7;

import java.util.Scanner;

public class exam9_x {

    private static int solution(int totalSize, int divSize, int[] arr) {
        int answer = 0;
        int total = 0;
        int divSum = 0;
        int max = 0;

        for (int i : arr) {
            total += i;
        }

        int avg = total/divSize;
        System.out.println("total : " + total);
        System.out.println("avg: " + avg);

        for (int i=0; i < totalSize; i++) {
            divSum += arr[i];

            if (divSum == avg) {
                System.out.println("divSum == avg : " + divSum);
                if (divSum > max) {
                    max = divSum;
                }
                divSum = 0;
            } else if (divSum > avg) {

                int divNum1 = Math.abs(divSum - 15);
                int divNum2 = Math.abs(divSum-arr[i] - 15);
                System.out.println("divSum : " + divSum);
                System.out.println("arr[i] : " + arr[i]);
                System.out.println("divNum1 : " + divNum1);
                System.out.println("divNum2 : " + divNum2);
                if (divNum1 > divNum2) {
                    System.out.println("divNum1 < divNum2 : " + (divSum - arr[i]));
                    if (divSum > max) {
                        max = divSum- arr[i];

                    }
                    divSum = arr[i];
                } else {
                    System.out.println("divNum1 > divNum2 : " + divSum);
                    if (divSum > max) {
                        max = divSum;
                    }
                    divSum = 0;
                }

            }
        }


        answer = max;

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArr = new int[input1];
        for (int i=0; i < input1; i++) {
            inputArr[i] = in.nextInt();
        }

        System.out.println(solution(input1, input2, inputArr));
    }

}
