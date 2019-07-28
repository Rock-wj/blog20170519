

public class rotate {
    private static void rotateString(char[] str, int offset){
        char temp;
        if(offset==0) return;
        if(str.length==0) return;
        int len=str.length;
        for(int i=1;i<=offset%len;i++){
            temp=str[len-1];
            int j=len-2;
            while(j>=0){
                str[j+1]=str[j];
                j--;
            }
            str[0]=temp;
        }
        String result = String.valueOf(str);
        System.out.println(result);
    }

    public static void main(String[] args){
        char[] a=new char[]{'a','b','c','d','e','f'};
        int offset=2;
         rotateString(a,offset);
    }
}