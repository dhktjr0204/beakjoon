package lv1;

public class 키패드누르기 {
    public static int[][] keyPad = new int[][]{
            {3, 1},
            {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2},
            {3, 0}, {3, 2}
    };

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left_prev = keyPad[10];
        int[] right_prev = keyPad[11];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {

                answer += "L";
                left_prev = keyPad[numbers[i]];

            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {

                answer += "R";
                right_prev = keyPad[numbers[i]];

            } else {
                int[] targetLoc=keyPad[numbers[i]];
                int leftDist = Math.abs(targetLoc[0] - left_prev[0]) + Math.abs(targetLoc[1] - left_prev[1]);
                int rightDist = Math.abs(targetLoc[0] - right_prev[0]) + Math.abs(targetLoc[1] - right_prev[1]);

                if (leftDist > rightDist) {
                    answer += "R";
                    right_prev = targetLoc;
                } else if (leftDist < rightDist) {
                    answer += "L";
                    left_prev = targetLoc;
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        right_prev = targetLoc;
                    } else {
                        answer += "L";
                        left_prev = targetLoc;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        키패드누르기 problem = new 키패드누르기();
        System.out.println(problem.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
    }
}
