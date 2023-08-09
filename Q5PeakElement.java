public class Q5PeakElement {
    public static void main(String[] args) {
        int arr[]={3,2,51,4,6,35};

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println("the peak element is "+arr[i]);
            }
        }
    }
}
