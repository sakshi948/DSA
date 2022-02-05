class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         
        ArrayList<Integer> ans=new ArrayList<>();
        if(p.length()>s.length())
        {
            return ans;
        }
        HashMap<Character,Integer>pmap=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            char ch=p.charAt(i);
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>smap=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            char ch=s.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
        }
        
        if(pmap.equals(smap))
        {
            ans.add(0);
        }
        int max=Math.max(s.length(),p.length());
        int min=Math.min(s.length(),p.length());
        for(int i=min;i<max;i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-p.length());
            //add
            smap.put(ch1,smap.getOrDefault(ch1,0)+1);
            
            //remove
            if(smap.get(ch2)==1)
            {
                smap.remove(ch2);
            }
            else{
                smap.put(ch2,smap.get(ch2)-1);
            }
            if(pmap.equals(smap))
            {
                ans.add(i-p.length()+1);
            }
        }
        
        
        return ans;
    }
}