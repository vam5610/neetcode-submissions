class Solution {
    public String longestPalindrome(String s) {
        String lps= "";
        int low=0, high=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            low =i;
            high= i;

            while( low>=0 && high <s.length() && s.charAt(low)== s.charAt(high)){
                low--;
                high++;
            }
            String palindrom = s.substring(low+1,high);
            if(palindrom.length()>lps.length()){
                lps= palindrom;
            }
            //even lenght
            low= i-1;
            high= i;
            while(low>=0 && high < s.length() && s.charAt(low)== s.charAt(high)){
                low--;
                high++;
            }
            palindrom = s.substring(low+1, high);
            if(palindrom.length()>lps.length()){
                lps= palindrom;
            }
        }
        return lps;
    }
}
