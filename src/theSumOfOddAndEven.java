public class theSumOfOddAndEven {
    public static void main(String[] args) {
        int odd = 0,even = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                odd = odd+i;
            }
            else{
                even = even+i;
            }
        }
        System.out.println("奇数和为"+odd);
        System.out.println("偶数和为"+even);
    }
}
