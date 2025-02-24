package section6;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam8 {

    private static Integer solution(int input1, int input2, Queue<Medi> originQueue) {
        Integer answer = 0;

        while(!originQueue.isEmpty()) {
            Queue<Medi> tempQueue = new LinkedList<>(originQueue);
            int size = tempQueue.size()-1;
            //Queue<Medi> tempQueue = originQueue;  // 객체 참조
            Medi currentPoll = tempQueue.poll();
            Medi originPoll = originQueue.poll();

            // currentPoll < nextPoll 있는지 체크하고 있으면 offer로 맨뒤에 넣기
            for (int i=1; i < input1; i++) {
                Medi nextPoll = tempQueue.poll();
                if (nextPoll != null && currentPoll.getPrior() < nextPoll.getPrior()) {
                    originQueue.offer(originPoll);
                    break;
                }
            }

            // 처음 사이즈와 같고(추가로 offer로 된게 없으면 빠지는 숫자면 answer++)
            // 처음 주어진 인덱스 값이면 끝
            if (size == originQueue.size()) {
                answer++;
                if (originPoll.getIdx() == input2) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        Queue<Medi> currentQueue = new ArrayDeque<>();
        for(int i=0; i < input1; i++) {
            currentQueue.offer(new Medi(i,in.nextInt()));
        }

        System.out.print(solution(input1, input2, currentQueue));
    }

    private static class Medi {
        private Integer idx;
        private Integer prior;

        Medi (Integer idx, Integer prior) {
            this.idx = idx;
            this.prior = prior;
        }

        public Integer getIdx() {
            return idx;
        }

        public Integer getPrior() {
            return prior;
        }
    }

}
