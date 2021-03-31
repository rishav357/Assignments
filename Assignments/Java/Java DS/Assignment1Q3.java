import java.util.*;
class SiCi {
    public static double simpleInterest(double principalAmount,int time,double interestRate){
        return((principalAmount*time*interestRate)/100);       
        }
         public static double compoundInterest(double principalAmount,int time,double interestRate){
             double x=Math.pow(1+interestRate,time);
        return(principalAmount*x-principalAmount);
    }    
}   

public class Assignment1Q3 extends SiCi{
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);     
System.out.println("Enter principal amount");  
double principalAmount= sc.nextDouble();  
System.out.println("Enter time ");  
int time= sc.nextInt();  
System.out.println("Enter interest rate");  
double interestRate= sc.nextDouble();
System.out.println(simpleInterest(principalAmount,time,interestRate));
System.out.println(compoundInterest(principalAmount,time,interestRate));       
        
    }
}