import java.util.Scanner;
class sumofarray{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		 int num = sc.nextInt();

    int[] arr = new int[num];
    for(int i = 0 ; i < num  ; i++){
        arr[i] = sc.nextInt();
    }
    int sum = 0 ;
    for (int i = 0 ; i<num ; i++){
        sum = sum+arr[i];
       
    }
    System.out.print(sum);


    }
}
		
		