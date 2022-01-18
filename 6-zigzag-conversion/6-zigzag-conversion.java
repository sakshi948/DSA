class Solution {
    public String convert(String s, int n) {
        int len = s.length();
        StringBuilder[] sbr = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            sbr[i] = new StringBuilder();
        }

        int k = 0;    // char index
        while(k < len) {
            boolean upwards = false;         // direction flag to go down the rows or up
            for (int i = 0; i < n;) {        // this loop oscillates between 0 to (n-1) 
                if(k == len) break;          // therefore, this breaking condition is necessary

                sbr[i].append(s.charAt(k));
                k++;

                if(i == 0) {
                    upwards = false;        // means you're at 0th row so move down as usual
                } else if(i == n-1) {
                    upwards = true;         // means you reached last row so move upwards now
                }

                if(upwards) {
                    i--;              //  to move 1 row up
                } else {
                    i++;              //  to move 1 row down
                }
            }
        }

		// reverse traverse sb array and append all sb to 0th one
        for (int i = n-1; i > 0 ; i--) {
            sbr[i-1].append(sbr[i].toString());
        }

        return sbr[0].toString();
    }
}