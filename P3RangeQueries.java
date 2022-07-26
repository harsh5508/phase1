package phase1programs_3;

class P3RangeQueries {
    public static void preCompute(int arr[], int n, int pre[])
    {
        pre[0] = arr[0];
        for (int i = 1; i < n; i++)
            pre[i] = arr[i] + pre[i - 1];
    }
    public static int rangeSum(int i, int j, int pre[])
    {
        if (i == 0)
            return pre[j];
 
        return pre[j] - pre[i - 1];
    }
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 50};
        int n = arr.length;
 
        int pre[] = new int[n];
 
        preCompute(arr, n, pre);
        System.out.println(rangeSum(1, 3, pre));
        System.out.println(rangeSum(2, 4, pre));
    }
}
