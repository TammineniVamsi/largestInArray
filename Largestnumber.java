public class largestnumberinarray {
    //declaring a function for finding largest element in an array
    public static int largestnum(int arr[]){
        //take a variable as largest
        int largest=Integer.MIN_VALUE;  //This is a -infinity value
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        //define an array
        int arr[]={1,5,6,4,2,3,8,9,7};

        //making a function call
        System.out.println("The largest element from the given array is: "+ largestnum(arr));

    }
    
}
