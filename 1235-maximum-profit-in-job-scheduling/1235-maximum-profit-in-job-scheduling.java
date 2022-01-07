class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        // Key -> endTime, Value -> profit
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        List<int[]> jobs = new ArrayList<>();
        for(int i=0; i<startTime.length; i++){
            jobs.add(new int[]{startTime[i], endTime[i], profit[i]});
        }
        
        // sorting according to endTime
        Collections.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));
        
        int maxProfit = 0;
        for(int[] job: jobs){
            Integer entryProfit = map.floorKey(job[0]);
            int profitTillNow = (entryProfit==null) ? 0:map.get(entryProfit);
            int newProfit = profitTillNow + job[2];
            maxProfit = Math.max(maxProfit, newProfit);
            map.put(job[1], maxProfit);
        }
        
        return maxProfit;
    }
}