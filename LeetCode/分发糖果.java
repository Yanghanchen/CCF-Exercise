class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return -1;
        }
        int[] L = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            L[i] = 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]
                    && L[i] <= L[i - 1]) {
                L[i] = L[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]
                    && L[i] <= L[i+1]) {
                L[i] = L[i+1] + 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < L.length; i++) {
            sum += L[i];
        }
        return sum;
    }
}