public class BitwiseSwap {
    public static void main(String[] args) {
        int a = 12;
        int b = 25;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

      
        a = a ^ b; 
        b = a ^ b; 
        a = a ^ b; 

        System.out.println("After Swap : a = " + a + ", b = " + b);
    }
}
