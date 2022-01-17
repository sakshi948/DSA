class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[] = s.split(" ");
        if(word.length!=pattern.length()) return false;
        HashMap<Character,String> mp=new HashMap<>();
        for(int i=0;i<word.length;i++)
        {
            char c=pattern.charAt(i);
            if(mp.containsKey(c))
            {
                if(!word[i].equals(mp.get(c)))
                    return false;
            }
            else{
                if(mp.containsValue(word[i]))
                {
                    return false;
                }
            }
            mp.put(c,word[i]);
        }
        return true;
    }
}