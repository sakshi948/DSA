class Solution {
    public int reverse(int x) {
        // rx -> reverse of x
        // prx-> previous value of rx
        int prx=0,rx=0;
        while(x!=0){
            rx=rx*10+x%10;
            if((rx-x%10)/10!=prx){
                rx=0;
                break;
            }
            else{
                prx=rx;
            }
            x/=10;
        }
        return rx;
    }
}