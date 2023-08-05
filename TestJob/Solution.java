class Solution {
    public static void main(String[] args){
        int[] left = new int[] {};
        int[] right = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(getLastMoment(7, left, right));
    }

    public static int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft = 0;
        for(int i : left) {
            maxLeft=Math.max(maxLeft, i);
        }
        int minRight = n;
        for(int i : right) {
            minRight=Math.min(minRight, i);
        }
        return Math.max(maxLeft, n - minRight);
    }
}