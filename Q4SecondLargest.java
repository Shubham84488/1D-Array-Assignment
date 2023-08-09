public class Q4SecondLargest {

    static int findSec(int arr[]){
        int max=Integer.MIN_VALUE;
        int secmax= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        
        // For second largest
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                if(secmax<arr[i]){
                    secmax=arr[i];
                }
            }
        }
        return secmax;
    }
    public static void main(String[] args) {
        int arr[]={3,2,51,4,6,35};
        System.out.println("Second largest element is " + findSec(arr));

    }
}
