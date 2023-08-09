public class Q1SumEven{
    public static void main(String[] args) {
        int arr[]={3,2,51,4,6,35};
        int sumeven=0;
        for (int i = 0; i < arr.length; i=i+2) {
            sumeven+=arr[i];
        }
        System.out.println("The sum of even indices are "+sumeven);
    }
}
