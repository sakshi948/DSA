class Solution {
    public boolean canJump(int[] nums) {
     int n=nums.length;
     boolean arr[]=new boolean[n];
     
     arr[n-1]=true;
     
     if(n==1)
     {return true;}
     else
     {
         for(int i=n-2;i>=0;i--)
         {   
             boolean ans=false;
             if(nums[i]==0)
             {
                     arr[i]=false;
                     continue;
             }
             for(int j=i+1;j<=i+nums[i]&&j<n;j++)
             {
                 ans=ans|arr[j];
             }
             arr[i]=ans;
         }
      }
       return arr[0]; 
    }
}