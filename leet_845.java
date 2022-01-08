class Solution {
    public int longestMountain(int[] arr) {
        int l = 0;
        int r = 0;
        int ans = 0;

        // 2, 1, 4, 7, 3, 2, 5
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                l = i;
                r = i;
                while (l > 0 && arr[l] > arr[l-1]) {
                    l--;
                }
                while (r < arr.length - 1 && arr[r] > arr[r + 1]) {
                    r++;
                }
            }
            ans = Math.max(ans, r - l + 1);
        }
        
        if (ans == 1) ans = 0;

        return ans;
    }
}
