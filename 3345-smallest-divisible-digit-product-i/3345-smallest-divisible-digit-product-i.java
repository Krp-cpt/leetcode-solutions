class Solution {
    public int smallestNumber(int n, int t) {
        int r = n;
        int product = 1;
        while(r>0){
            product*=r%10;
            r=r/10;
        }
        while(product%t != 0){
            n++;
            r = n;
            product = 1;
             while(r>0){
            product*=r%10;
            r=r/10;
        }
        }
        return n;
    }
}