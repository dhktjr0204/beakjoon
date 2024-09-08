package pcce;

public class 붕대감기 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;

        for (int i = 0; i < attacks.length; i++) {
            if (i != 0) {
                int healingTime = attacks[i][0] - attacks[i - 1][0] - 1;

                health = Math.min(maxHealth, health + (bandage[1] * healingTime));

                if (healingTime >= bandage[0]) {
                    health = Math.min(maxHealth, health + bandage[2] * (healingTime / bandage[0]));
                }
            }

            health -= attacks[i][1];

            if (health <= 0) {
                return -1;
            }
        }

        return health;
    }

    public static void main(String[] args) {
        붕대감기 problem = new 붕대감기();
        System.out.println(problem.solution(new int[]{2, 4, 4},
                100,
                new int[][]{{1, 96}, {18, 1}}));
    }
}
