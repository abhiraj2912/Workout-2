
import java.util.Scanner;

class Faculty{
    int facultyId, salary;


}

class FullTimeFaculty extends Faculty {
    int basic, allowance;

    void FTInput(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter FullTime Faculty ID: ");
        facultyId=sc.nextInt();
        System.out.println("Enter basic salary: ");
        basic=sc.nextInt();
        System.out.println("Enter allowance: ");
        allowance=sc.nextInt();
        salary = basic+allowance;
    }
    void display() {
        System.out.println("\nFullTime Faculty ");
        System.out.println("Faculty ID - " + facultyId);
        System.out.println("Basic - " + basic);
        System.out.println("Allowance - " + allowance);
        System.out.println("Salary - " + salary);
    }
}
class PartTimeFaculty extends Faculty {
    int hour, rate;

    void PTInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PartTime Faculty ID: ");
        facultyId=sc.nextInt();
        System.out.println("Enter number of hours worked: ");
        hour = sc.nextInt();
        System.out.println("Enter Rate: ");
        rate = sc.nextInt();
        salary = hour*rate;
    }
    void display() {
        System.out.println("\nPartTime Faculty ");
        System.out.println("Faculty ID - " + facultyId);
        System.out.println("Hours Worked - " + hour);
        System.out.println("Rate - " + rate);
        System.out.println("Salary - " + salary);
    }
}


public class DriverClassFaculty {
    public static void main(String [] args){
        FullTimeFaculty f1 = new FullTimeFaculty();
        FullTimeFaculty f2 = new FullTimeFaculty();
        PartTimeFaculty p1 = new PartTimeFaculty();
        PartTimeFaculty p2 = new PartTimeFaculty();

        f1.FTInput();
        f2.FTInput();
        p1.PTInput();
        p2.PTInput();

        f1.display();
        f2.display();
        p1.display();
        p2.display();

    }
}
