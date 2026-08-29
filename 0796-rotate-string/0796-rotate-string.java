class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(new String(ch).equals(goal)){
                return true;
            }
            else{
                char temp = ch[ch.length-1];
                for(int j=ch.length-2;j>=0;j--)
                {
                  ch[j+1] = ch[j];  
                }
                ch[0] = temp;
            }
        }
        return false;
    }
}