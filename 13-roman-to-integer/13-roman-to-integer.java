import java.util.Map;
import static java.util.Map.entry;

class Solution {    
    private Map<Character, Integer> map = Map.ofEntries(
         entry('I', 1),
         entry('V', 5),
         entry('X', 10),
         entry('L', 50),
         entry('C', 100),
         entry('D', 500),
         entry('M', 1000)
    );

    public int romanToInt(String s) {
        var size = s.length();
        int prev = 0;
        int sum = 0;
        for (int i=size-1; i>= 0; i--) {
            var str = s.charAt(i);
            int val = map.get(str);
            if (prev != 0 && prev > val) {
                sum -= val;
            } else {
                sum += val;
            }
            prev = val;
        }
        return sum;
    }
}