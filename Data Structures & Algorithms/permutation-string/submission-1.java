class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n= s1.length();
        int m= s2.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            arr[s1.charAt(i) - 'a']++;
        }
        for(int j=0;j<=m-n;j++){
            int[] brr= new int[26];
            int i=0;
            while(i<n){
                brr[s2.charAt(i+j)-'a']++;
                i++;
            }
            if(matched(arr,brr)){
                return true;
            }

        }
        return false;
    }
    static boolean matched(int[] arr, int[] brr){
        for(int i=0;i<26;i++){
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }
}
