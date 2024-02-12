package _01_MethodsAndFunctions;

public class armstrongno {
    public static void main(String[] args) {
        System.out.println("hello");
        //Print all three digit armstrong numbers
        for(int i=100;i<=999;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n%10;
            n = n /10;
            sum+=(rem*rem*rem);
        }
        return sum==original;
    }
}
