class Solution {
    public String decodeString(String s) {
      Stack<String> strstack = new Stack<>();
      Stack<Integer> numstack = new Stack<>();
      StringBuilder current = new StringBuilder();
      int num = 0;
      for(char ch : s.toCharArray()){
        if(Character.isDigit(ch)){
            num = num*10 +(ch - '0');
        }
        else if(ch == '['){
            numstack.push(num);
            strstack.push(current.toString());
            num =0;
            current = new StringBuilder();
        }
        else if(ch == ']'){
            int count = numstack.pop();
            String prev = strstack.pop();
            StringBuilder temp = new StringBuilder(prev);
            for(int i=0;i<count;i++){
                temp.append(current);
            }
            current = temp;
        }
        else{
            current.append(ch);
        }
      }  
      return current.toString();
    }
}