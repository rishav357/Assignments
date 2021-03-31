class Student {
    private int subjectA,subjectB,subjectC;

    public static int TotalMarks(Student[] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectA+s.subjectB+s.subjectC;
        }
        return sum;
    }

    public static double studentsAverageMarks(Student[] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectA+s.subjectB+s.subjectC;
        }
        avg=sum/3;
        return avg;
    }

    public static int subjectATotal(Student [] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectA;
        }
        return sum;
    }
    public static int subjectBTotal(Student [] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectB;
        }
        return sum;
    }
    public static int subjectCTotal(Student [] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectC;
        }
        return sum;
    }


    public static double subjectAAverage(Student [] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum +=s.subjectA;
        }
        avg=sum/3;
        return avg;
    }
    public static double subjectBAverage(Student [] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum +=s.subjectB;
        }
        avg=sum/3;
        return avg;
    }
    public static double subjectCAverage(Student [] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum +=s.subjectC;
        }
        avg=sum/3;
        return avg;
    }

    Student(int x,int y, int z)
    {
        subjectA=x;
        subjectB=y;
        subjectC=z;
    }
}

public class Assignment1Q9 extends Student{

    Assignment1Q9(int x, int y, int z) {
        super(x, y, z);
    }
    public static void main(String[] args) {
        Student s1= new Student(10,20,30);
        Student s2= new Student(10,20,30);
        Student s3= new Student(10,20,30);
        Student s[]={s1,s2,s3};
        System.out.println(TotalMarks(s));
        System.out.println(studentsAverageMarks(s));
        System.out.println(subjectATotal(s));
        System.out.println(subjectAAverage(s));
        System.out.println(subjectBTotal(s));
        System.out.println(subjectBAverage(s));
        System.out.println(subjectCTotal(s));
        System.out.println(subjectCAverage(s));


         


    }
}