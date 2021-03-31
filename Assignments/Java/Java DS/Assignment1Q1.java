class ArmstrongOrNot {
    int n;
    public static boolean armstrongCheck(int num) {
        int a=num;
        int r=0,sum=0;
        while(num>0){
            r=num%10;
            sum+=r*r*r;
            num/=10;
        }
        return(sum==a);
    }
}

public class Assignment1Q1 extends ArmstrongOrNot{
    public static void main(String[] args) {
        ArmstrongOrNot k=new ArmstrongOrNot();
        k.n=371;
        System.out.println(armstrongCheck(k.n));
    }
}