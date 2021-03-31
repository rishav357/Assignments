import java.util.*;
class Login{
    static int i;
    static String userId = "Vipul",pass = "passwd";
    public static String loginUser(String userId, String pass) {
        if(userId.equals("Vipul")&&pass.equals("passwd"))
        {
            return "Welcome Vipul";
        }
        else{
            for(i=0;i<4;i++){
                
            return "You have entered wrong credentials ,please enter the right credentials";
            }if(i==3)
            {
                return "Contact Admin";
            }
        }
        return (" ");
    }

}
public class Assignment1Q6 extends Login{
    public static void main(String[] args) {
        
        String userId, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        userId = s.nextLine();
        System.out.print("Enter password:");
        pass = s.nextLine();
        System.out.println(loginUser(userId,pass));
        
}
}