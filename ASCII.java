import java.util.Scanner;
class vote {
 public static void main(String[] args) {
 int letter = 65, i, j,rows;
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
 rows = in.nextInt();
 for (i = 0; i <= rows; i++) {
 for (j = 0; j <= i; j++) {
 System.out.print((char)(letter + j)+" ");
 }
 System.out.println("");
 }