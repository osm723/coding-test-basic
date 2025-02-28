package section7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exam7_answer {

    private static ArrayList<Point> solution(int input1, ArrayList<Point> list) {
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        ArrayList<Point> list = new ArrayList<>();

        for (int i=0; i<input1; i++) {
            list.add(new Point(in.nextInt(), in.nextInt()));
        }

        for (Point point : solution(input1, list)) {
            System.out.println(point.getX() + " "+ point.getY());
        }
    }

}

class Point implements Comparable<Point> {

    public int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            //return o.y-this.y;
            return this.y-o.y;
        } else {
            //return o.x-this.x;
            return this.x-o.x;
        }
    }

}
