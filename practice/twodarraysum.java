import java.util.*;
public class twodarraysum
{
public static void main (String [] args);j;
{                                                                       
Scanner sc = new Scanner(System.in);
System.out.println("Enter rows");
int r = sc.nextInt();
System.out.println("Enter colums");
int c = sc.nextInt();
 int [][] arr  = new int [r][c];
 for (int i = 0 ; i < r ; i++){
 for(int j = 0 ; j < c ; j++){
 arr [i][j] = sc.nextInt();
 }
 }
 int sum = 0;
 for (int i = 0 ; i < r ; i++){
 for (int j = 0 ; j < c ; j++){
 sum += arr[r][c];
 }
 }
 System.out.println("sum of 2d arr" + sum);
 }
 }
