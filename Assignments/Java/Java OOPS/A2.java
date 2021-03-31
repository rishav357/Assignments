import java.util.ArrayList;
class Manager extends A2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        salary+=incentive;
        return salary;
    }
}

class Labour extends A2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        salary+=overtime;
        return salary;
    }
}


public class A2 {
    static int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int totalsal=0;
        for(int x:employeeSalaries)
        {
            totalsal+=x;
        }
        return totalsal;
    }
    public static void main(String[] args){
        A2 l1 = new Labour();
        A2 l2 = new Labour();
        A2 m1 = new Manager();
        A2 m2 = new Manager();
        ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
        employeeSalaries.add(l1.getSalary(salary));
        employeeSalaries.add(l2.getSalary(salary));
        employeeSalaries.add(m1.getSalary(salary));
        employeeSalaries.add(m2.getSalary(salary));
        System.out.println(employeeSalaries);
        
    }
}