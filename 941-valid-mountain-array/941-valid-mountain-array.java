class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length,inc=1,i,change=-1,count=0;
        if(n<3) return false;
        if(arr[0]>=arr[1])return false;
        for(i=0;i<arr.length-1;i++)
        {
              
              if(inc==1&&arr[i]>=arr[i+1])
              {
                  change=i;
                  inc=0;
              }
              if(inc==0&&arr[i+1]<arr[i])
              { 
                  count++;
                  if(count==n-change-1)
                  {
                      return true;
                  }
                    
              }
        }
        
            
         return false;
    }
}