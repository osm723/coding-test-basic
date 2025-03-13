package section9;

import java.util.ArrayList;
import java.util.Scanner;

public class exam15 {

    static int[][] map;
    static int[] combi;
    static ArrayList<Point> pizza;
    static ArrayList<Point> house;
    static int[][] range = {{1,0},{-1,0},{0,1},{0,-1}};
    static int totalPizzaCnt;
    static int ChooseCnt;
    static int answer = Integer.MAX_VALUE;


    private static void DFS(int L, int s) {
        if (L == ChooseCnt) {
            int sum = 0;
            for (Point h: house) {
                int dis = Integer.MAX_VALUE;
                for (int c : combi) {
                    dis = Math.min(dis, Math.abs(h.getX()-pizza.get(c).getX()) + Math.abs(h.getY()-pizza.get(c).getY()));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < totalPizzaCnt; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        ChooseCnt = in.nextInt();
        map = new int[input1][input1];
        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                map[i][j] = in.nextInt();
                if (map[i][j] == 1) {
                    house.add(new Point(i, j));
                }
                if (map[i][j] == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }

        totalPizzaCnt = pizza.size();
        combi = new int[ChooseCnt];

        DFS(0, 0);

        System.out.println(answer);

    }


}
