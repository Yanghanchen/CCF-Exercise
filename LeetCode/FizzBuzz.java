class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        if(n==0){
            return result;
        }else{
            int i = 0;
            while(i++<n){
                StringBuilder sb=new StringBuilder();
                if(i%3==0||i%5==0){
                    if(i%3==0){
                        sb.append("Fizz");
                    }if(i%5==0){
                        sb.append("Buzz");
                    }
                }else{
                    sb.append(i);
                }
                result.add(sb.toString());
            }
            return result;
        }
    }
}