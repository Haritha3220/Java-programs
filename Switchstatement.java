import java.util.Scanner;
class Calculator {
 public static void main(String[] args) {
 int ch, n1, n2;
 System.out.println("1.Addition");
 System.out.println("2.Subtraction");
 System.out.println("3.Multiplication");
 System.out.println("4.Division");
 System.out.println("Enter your choice : ");
 
 Scanner in = new Scanner(System.in);
 ch = in.nextInt();
 System.out.println("Enter two operands: ");
 n1 = in.nextInt();
 n2 = in.nextInt();
 
 switch (ch) {
 case 1:
 System.out.println("sum = " + (n1 + n2));
 break;
 case 2:
 System.out.println("sub = " + (n1 - n2));
 break;
 case 3:
 System.out.println("mul = " + (n1 * n2));
 break;
 case 4:
 System.out.println("division = " + (n1 / n2));
 break;
 default:
 System.out.println("Error! Select only from 1 to 4");
 }
 }
}