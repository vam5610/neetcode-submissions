class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr= s.toCharArray();
        char[] brr= t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        s= new String(arr);
        t= new String(brr);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}
