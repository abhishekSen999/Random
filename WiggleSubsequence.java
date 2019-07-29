class WiggleSubsequence {
    int memo[][];
    public int wiggleMaxLength(int[] nums) {
        memo=new int [2][nums.length];
        
        /*
            {.......}-peak of sloap
            {.......}-bottom of sloap
        */
        for(int i=0;i<memo.length;i++)
        {
            for(int j=0;j<memo[i].length;j++)memo[i][j]=-1;
        }
        
        
        int count1=wiggleCount(nums,nums.length-1,true,Integer.MIN_VALUE);
        int count2=wiggleCount(nums,nums.length-1,false,Integer.MAX_VALUE);
        
        return Math.max(count1,count2);
        
    }
    int wiggleCount(int [] nums,int n,boolean greater,int reference)
    {
        if(n<0)return 0;
        int count1=0;
        int a=nums[n];
        if(greater && a>reference){
            
            //searching in smaller memo
            if(memo[0][n]!=-1)count1=memo[0][n];
            else 
            {
                count1=1+wiggleCount(nums,n-1,!greater,a);
                memo[0][n]=count1;
            }
        }
        else if (!greater && a<reference)
        {
            if(memo[1][n]!=-1)count1=memo[1][n];
            else {
                count1=1+wiggleCount(nums,n-1,!greater,a);
                memo[1][n]=count1;
            }
        }
        int count2=wiggleCount(nums,n-1,greater,reference);
        return Math.max(count1,count2);
    }
}