public class ab {
    private static int add(int a, int b) {
        // write your code here
        int result = 0;
        int sum = a^b;
        int carry = (a&b)<<1;
        if(carry != 0){
            add(sum,carry);
        }else{
            result = sum;
        }
        return result;
    }
    public static void main(String[] args){
        int sum;
        int a = 3;
        int b = 2;
        sum = add(a,b);
        System.out.println(sum);
     }
}
