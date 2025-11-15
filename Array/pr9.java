/******************************************************************************
8.Find Pair with a Given Sum
*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int sum=8;

        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("pair is:"+arr[i]+"&"+arr[j]);
                }
            }
            
        }
    }
}
