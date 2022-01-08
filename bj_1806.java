public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int s= 1;

        int ans = sol(arr, s);
        System.out.println("ans = " + ans);
    }

    public static int sol(int[] arr, int s) {
        int sum = arr[0];
        int ans = arr.length;
        int l = 0, r = 0;

        while (l <= r && r < arr.length - 1) {
            if (sum < s) {
                r++;
                sum += arr[r];
            } else {
                ans = Integer.min(ans, r - l  +1);
                sum -= arr[l];
                l++;
            }
        }

        return ans;
    }
}

