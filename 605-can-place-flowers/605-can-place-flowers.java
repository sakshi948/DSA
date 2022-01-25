class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        if(n==0)
        {
            return true;
        }
        
        if(n==1&&flowerbed[0]==0&&len==1)
        {
           return true; 
        }
        
         for(int i=0;i<len;i++)
         {
             
             if(flowerbed[i]==0)
             {
                 if(i==0&&flowerbed[i+1]==0)
                 {
                     flowerbed[i]=1;
                     n--;
                 }
                 else if(i==len-1&&flowerbed[i-1]==0)
                 {
                     flowerbed[i]=1;
                     n--;
                 }
                 else if(i>0&&i<len-1&&flowerbed[i-1]==0&&flowerbed[i+1]==0)
                 {
                     flowerbed[i]=1;
                     n--;
                 }
             }
       }
        return n<=0;
    }
}