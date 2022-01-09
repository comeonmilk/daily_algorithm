import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
       int answer = 0;
        Arrays.sort(scoville);

        Queue<Integer> que = new PriorityQueue<>();
        for (int s : scoville) {
            if (s < K) {
                que.add(s);
            }
        }

        while (que.size() != 1) {
            int v1 = que.poll();
            int v2 = que.poll();
            int c = v1 + v2 * 2;
            que.offer(c);
            answer++;

            if (que.peek() >= K) {
                return answer;
            }
        }


        return -1;
    }
}
