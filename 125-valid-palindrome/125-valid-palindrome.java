class Solution {
    public boolean isPalindrome(String s) {
        String st = "";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if(c>='a' && c<='z' || c>='0' && c<='9')
            st=st+c;
            
        }
        
        return prim(st);

    }
    public static boolean prim(String str)
    {
        int fir=0,sec=str.length()-1,flag=0;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(fir)==str.charAt(sec))
            {
               fir++;
               sec--;
                continue;
                
            }
            else{
                flag=1;
            }
        }
        if(flag==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}