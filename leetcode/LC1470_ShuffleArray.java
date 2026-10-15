class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []result=new int[2*n];
        //不用再创建两个小数组把数分开再存入 直接从原数组取就好了
        for(int i=0;i<2*n;i++){
            if(i%2==0)
                result[i]=nums[i/2];//i是result数组的变量 从nums里取数要用i/2
            else
                result[i]=nums[n+i/2];
        }
        
        return result;
    }
}
