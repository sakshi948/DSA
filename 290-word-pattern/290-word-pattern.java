class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> m=new HashMap<>();
        String a[]=s.split(" ");
        if(pattern.length()!=a.length) return false;
        for(int i=0;i<a.length;i++){
            char c=pattern.charAt(i);
            if(m.containsKey(c)){
                if(!a[i].equals(m.get(c))) return false;
            }else{
                if(m.containsValue(a[i])){
                    return false;
                }
                m.put(c, a[i]);
            }
        }
        return true;
    }
}