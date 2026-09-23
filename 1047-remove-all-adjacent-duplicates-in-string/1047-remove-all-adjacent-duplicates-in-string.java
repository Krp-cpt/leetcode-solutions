class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char top = '\0';
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()){
                top = stack.peek();
            }
            
            if(top == s.charAt(i)){
                stack.pop();
                if(stack.isEmpty()){
                top = '\0';
            }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return new String(sb);
    }
}