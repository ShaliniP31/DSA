package arrays;

public class MaximumPointsFromCards_LC1423 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 1};//12
        int k = 3;
        System.out.println(maxScore(nums, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int r = cardPoints.length - 1, maxScore = 0, score = 0;
        for (int i = 0; i < k; i++) {
            score += cardPoints[i];
        }
        maxScore = Math.max(score, maxScore);
        for (int i = k - 1; i >= 0; i--) {
            score -= cardPoints[i];
            score += cardPoints[r];
            maxScore = Math.max(score, maxScore);
            r--;
        }
        return maxScore;
    }
}
