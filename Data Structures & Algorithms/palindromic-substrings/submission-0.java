class Solution {
    public int countSubstrings(String s) {
        int c =0;
        int l=0,h=0;
        int n= s.length();
        for(int i=0;i<s.length();i++){
            l=i;
            h=i;
            while(l>=0 && h<n && s.charAt(l)==s.charAt(h)){
                c++;
                l--;
                h++;
            }
            l= i-1;
            h= i;
            while(l>=0 && h<n && s.charAt(l)==s.charAt(h)){
                c++;
                l--;
                h++;
            }
        }
        return c;
    }

}
