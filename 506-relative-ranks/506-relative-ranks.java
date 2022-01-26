class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=score.length;
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            hm.put(score[i],i);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            pq.add(score[i]);
        }
        int pos=1;
        while(pos<=n)
        {
            int val=pq.poll();
            int index=hm.get(val);
            if(pos==1){arr[index]="Gold Medal";}
            else if(pos==2){arr[index]="Silver Medal";}
            else if(pos==3){arr[index]="Bronze Medal";}
            else{
                arr[index]=Integer.toString(pos);
            }
            
            pos++;
        }
        return arr;
    }
}