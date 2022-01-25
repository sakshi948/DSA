class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0, N = flowerbed.length;
        for (int i = 0; i < N; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i-1] == 0) && (i == N-1 || flowerbed[i+1] == 0)) {
                    cnt++;
                    flowerbed[i] = 1;
                }
            }
        }
        return cnt >= n;
    }
}