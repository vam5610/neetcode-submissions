class Solution {
    public boolean validPalindrome(String s) {        
        char []arr= s.toCharArray();
        int i=0,j= s.length()-1;
        while(i<j){
            if(s.charAt(i)== s.charAt(j)){
                i++;
                j--;
            }else{
                return isPlanidrome(s, i+1,j) || isPlanidrome(s,i, j-1);
            }
        }
        return true;
    }

    public boolean isPlanidrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}