public class Q3MaxElement {

    static int findmax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max= arr[i];
            }
        } 
        return max;
    }
    public static void main(String[] args) {
        int arr[]={3,2,51,4,6,35};
        System.out.println("Maximum element is " + findmax(arr));
    }
}
