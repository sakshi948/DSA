class Solution {
     public int reverse(int x) {
        long reversed =0;
        int flag = 0;
        if(x<0)
            flag =1;
        x = Math.abs(x);
        while(x!=0){
            reversed = (reversed*10) + x%10;
            x/=10;
            if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE)
                return 0;
        }
        if(flag ==1)
            reversed *= -1;
        return (int)reversed;
    }
 }
