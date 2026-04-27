class Solution {
    public int mySqrt(int x) {
        //make sure input is valid
        if (x == 0 || x == 1)
            return x;
        int low = 0, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * (long) mid > x) {
                high = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}