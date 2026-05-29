import java.util.Scanner;
public class dsa{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i < arr.length ; i++){
            System.out.println("Enter array elements: ");
           arr[i] = sc.nextInt();
        }


        for(int j =0; j<arr.length; j++){
            System.out.println("array elements are: "+arr[i]);
        }
    }
}