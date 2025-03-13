package section11;

import java.util.*;

public class exam4 {

    static List<Square> squares = new ArrayList<>();
    static int[] dy;

    private static int solution(int n) {
        Collections.sort(squares, Collections.reverseOrder());
        dy[0] = squares.get(0).height;

        for (int i=1; i < n; i++) {
            Square curSquare = squares.get(i);
            int curExtent = curSquare.extent;
            int curHeight = curSquare.height;
            int curWeight = curSquare.weight;
            for (int j=0; j < i; j++) {
                Square preSquare = squares.get(j);
                int preExtent = preSquare.extent;
                int preHeight = preSquare.height;
                int preWeight = preSquare.weight;
                //if (curExtent < preExtent && curWeight < preWeight) {
                if (curWeight < preWeight) {
                    if (dy[i] < dy[j]+curHeight) {
                        dy[i] = dy[j]+curHeight;
                    }
                }
            }

            if (dy[i] == 0) {
                dy[i] = curHeight;
            }
        }

        return Arrays.stream(dy).max().getAsInt();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        dy = new int[input1];
        for (int i=0; i < input1; i++) {
            int e = in.nextInt();
            int h = in.nextInt();
            int w = in.nextInt();
            squares.add(new Square(e, h, w));
        }

        System.out.println(solution(input1));
    }

}


class Square implements Comparable<Square>{
    int extent;
    int height;
    int weight;

    public Square(int extent, int height, int weight) {
        this.extent = extent;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Square o) {
        return this.extent-o.extent;
    }
}