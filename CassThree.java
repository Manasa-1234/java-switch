
import java.util.Scanner;
public class CassThree {
	public static void main(String[] args) {
int choice;
System.out.println("pick one : 1. hi\t2.hey \t3. hello\t ");
Scanner s = new Scanner(System.in);
choice=s.nextInt();
switch (choice)
{
         case 1 : System.out.println("you said hi");
                  break;
         case 2 : System.out.println("you said hey");
                  break;
         case 3 : System.out.println("yoy said hello");
                  break;
         default : System.out.println("invalid choice");
                   break;
                  
         
  

}
}
}
