import java.util.Scanner;//importing scanner package
class inputuser
{
  public static void main(String[]args)
  Scanner obj=new Scanner(System.in); //creating object 
  System.out.println("enter username");
  String username=obj.nextLine();// taking input from users
  System.out.println("username is :"+username);//output
}
