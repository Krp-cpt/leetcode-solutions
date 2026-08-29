class Solution {
    public String getEncryptedString(String s, int k) {
       k=k%s.length();
        StringBuilder str =  new StringBuilder(s);
        str.append(s);
        char[] ch = str.toString().toCharArray(); 
        char[] n = new char[s.length()];
        for(int i=0;i<s.length();i++){
            n[i] = ch[i+k];
        }
    
      return new String(n);
    }
}