import java.util.Arrays;

class ReverseArray {

    public static void reversArray(int[]arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            arr[start]^=arr[end];
            arr[end]^=arr[start];
            arr[start]^=arr[end];

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
       int []arr={4,3,2,1,0};
        reversArray(arr);
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
