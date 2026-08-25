class Solution {
    static boolean haszero(int num){
        while(num>0){
            if(num%10 == 0){
                return true;
            }
            num = num/10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
       int i=1;
       int j=0;
       while(i<n){
        j=n-i;
        if(!haszero(i) && !haszero(j)){
            return new int[]{i,j};
        }
        
        i++;
       } 
      return new int[]{ } ;

    }
}