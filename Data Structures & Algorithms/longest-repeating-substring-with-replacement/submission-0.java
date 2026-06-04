class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        int c=0;
        int n= s.length();
        int maxf=0,maxlen=0;
        HashMap<Character,Integer> map= new HashMap<>();
        while(r<n){
            char ch= s.charAt(r);
            map.put(ch, map.getOrDefault(ch,0)+1);
            maxf= Math.max(maxf, map.get(ch));
            c= (r-l+1)- maxf;
            if(c>k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if(s.charAt(l)==0){
                    map.remove(s.charAt(l));

                }
                l++;
                
            }
            maxlen= Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
        
    }
}
