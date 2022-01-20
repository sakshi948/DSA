class Solution {
    public String longestPalindrome(String s) {
        int length=s.length();
        boolean [][]dp=new boolean[length][length];
        int count=0;
        String str1="",str2="",str3="";
        for(int g=0;g<length;g++)
        {
            for(int i=0,j=g;j<length;i++,j++)
            {
                if(g==0){
                    {dp[i][j]=true;
                    str1=s.substring(i,i+1);}
                }
                else if(g==1){
                
                          if(s.charAt(i)==s.charAt(j))
                          {dp[i][j]=true;
                             str2=s.substring(i,j+1);}
                              }
                
                else{
                          if(dp[i+1][j-1]==true)
                         {
                           if(s.charAt(i)==s.charAt(j)){
                           dp[i][j]=true;
                           str3=s.substring(i,j+1);}
                         }
                       
                    }    
                    
                }
            }
         if (str3.isEmpty()==false)
         {
             return str3;
         }
        else if(str2.isEmpty()==false){
            return str2;
        }
        else{
            return str1;
        }
    }
}