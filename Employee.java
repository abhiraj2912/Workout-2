
public class Employee {
    String name, result;
    int EmpID, asm1, asm2,asm3;
    Employee(int eid, String n, int a1,int a2,int a3){
        EmpID=eid;
        name=n;
        asm1=a1;
        asm2=a2;
        asm3=a3;
        result = (asm1>75&&asm3>75&&asm2>75)?"Promoted":"Demoted";
    }
     void displayTP(){
         System.out.println("Name: "+name);
         System.out.println("Emp ID: "+EmpID);
         System.out.println("Result: "+result);
         int t=asm1+asm2+asm3;
         System.out.println("Total: "+t);
         double p = (double) t/300*100;
         System.out.println("Percentage: "+p+" %");
     }

    public static void main (String args []){
        Employee e1=new Employee(1,"Abhiraj",75,80,76);
        e1.displayTP();
    }
}
