class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList();
        if(s.length()==0 || s == null) return res;
        int [] occur = new int[26];
        for(char c : p.toCharArray()) occur[c-'a']++;
        int left = 0,right = 0,count = p.length();
        while(right<s.length()){
            if(occur[s.charAt(right++)-'a']-->=1) count--;
            if(count == 0) res.add(left);
            if(right-left==p.length() && occur[s.charAt(left++)-'a']++>=0) count++;
        }
        return res;
    }
}