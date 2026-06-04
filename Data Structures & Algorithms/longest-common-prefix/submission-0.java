class Solution {
    public String longestCommonPrefix(String[] strs) {
        int f= strs[0].length();
        char arr[]= strs[0].toCharArray();
        String s= "";
        boolean contains= false;
        for(char ch :arr){
            String nextS = s + ch;
            for(int i=1;i<strs.length;i++){
                if(strs[i].startsWith(nextS)){
                    contains= true;
                }else{
                    contains= false;
                    break;
                }
            }
            if(!contains && strs.length > 1){
                return s;
            }
            s = nextS;
        }
        return s;

    }
}