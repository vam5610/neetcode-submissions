class Solution {
    public int calPoints(String[] operations) {
        int n= operations.length;
        ArrayList<Integer> arr= new ArrayList<>();
        int sum=0;
        for( String s: operations){
            if(s.equals("+")){
                int var= arr.get(arr.size()-1) + arr.get(arr.size()-2);
                arr.add(var);
            }else if(s.equals("C")){
                arr.remove(arr.size()-1);
            }else if(s.equals("D")){
                int var= 2 * arr.get(arr.size()-1);
                arr.add(var);
            }else{
                arr.add(Integer.parseInt(s));
            }
        }
        int s=0;
        for(int i=0;i<arr.size();i++){
            s= s+ arr.get(i);
        }
        return s;
    }
}