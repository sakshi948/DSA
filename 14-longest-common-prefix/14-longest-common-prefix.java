class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
      
        int minlength=500;
        for(int i=0;i<strs.length;i++)
        {
          minlength=Math.min(strs[i].length(),minlength)  ;
        }
        boolean flag=true;
        String ans[]=new String[1];
        ans[0]="";
        prefix(ans,strs,0,minlength,flag);
            return ans[0];
        
    }
    public static String[] prefix(String[] ans,String[]strs,int curr,int minlength,boolean flag)
    {
        if(curr>=minlength)
        {
            return ans;
        }
        char ch=strs[0].charAt(curr);
     
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].charAt(curr)!=ch)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            ans[0]+=ch;
            prefix(ans,strs,curr+1,minlength,flag);
        }
        return ans;
    }
}