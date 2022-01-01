class Solution {
    public void sortColors(int[] arr) {
        int low=0,mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
             if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==2)
            {
                int temp1=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp1;
                high--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}