class Solution {
    public String convert(String s, int numRows) {
       if(numRows == 1 || s.length()<numRows){
        return s;
       }
       StringBuilder[] rows = new StringBuilder[numRows];
       for(int i=0;i<numRows;i++){
        rows[i] = new StringBuilder();
       }
       int row = 0;
       int direction = 1;
       for(char ch:s.toCharArray()){
        rows[row].append(ch);
        if(row == 0){
            direction = 1;
        }
        else if(row == numRows-1){
            direction = -1;
        }
        row+=direction;
       }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<numRows;i++){
            str.append(rows[i]);
        }
        return str.toString();
    }
}