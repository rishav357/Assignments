import java.util.ArrayList;

class CurrentAccounts extends A3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;

    @Override
    public int getCash() {
        return totalDeposits - creditLimit;
    }
}

class SavingsAccount extends A3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    @Override
    public int getCash() {
        return totalDeposits + fixedDepositAmount;
    }
}

public class A3 {
    public int totalCashInBank(ArrayList<Integer> cash) {
        int sum=0;
        for(int i=0;i<cash.size();i++)
            sum+=cash.get(i);
        return sum;

    }

    public int getCash() {
        return 0;
    }

    public static void main(String[] args) {
        CurrentAccounts ca=new CurrentAccounts();
        SavingsAccount sa=new SavingsAccount();
        int current=ca.getCash();
        int savings=sa.getCash();

        ArrayList<Integer>amount=new ArrayList<>();
        amount.add(current);
        amount.add(savings);

        A3 a=new A3();
        System.out.println(a.totalCashInBank(amount));
    }
}