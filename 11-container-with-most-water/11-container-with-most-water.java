class Solution{ 
public int maxArea(int[] h) {
        int start = 0, end = h.length-1, max = 0;

        while(start < end){
            max = Math.max(max, (end-start) * Math.min(h[end],h[start]));
            if(h[end] > h[start]){start++;}
            else{end--;}
        }
        return max;
    }
}