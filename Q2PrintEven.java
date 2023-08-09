public class Q2PrintEven{
    public static void main(String[] args) {
        int arr[]={3,2,51,4,6,35};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}