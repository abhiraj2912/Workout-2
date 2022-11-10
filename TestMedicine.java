import java.util.Random;

class Medicine{

    void displayLabel(){
        System.out.println("Sun Pharma");
        System.out.println("Mumbai,India");
    }

}

class Tablet extends Medicine{
    void displayLabel(){
        System.out.println("Tablet");
        System.out.println("Store in a cool dry place");
    }

}

class Syrup extends Medicine{
    void displayLabel(){
        System.out.println("Syrup");
        System.out.println("Thick liquid containing sugar");
    }
}

class Ointment extends Medicine{
    void displayLabel(){
        System.out.println("Ointment");
        System.out.println("For external use only");
    }

}

public class TestMedicine {
    public static void main(String [] args){
        Random r1 =new Random();
        int a=r1.nextInt(1,4);
        if(a==1){
            Tablet obj = new Tablet();
            obj.displayLabel();
        } else if (a==2) {
            Syrup obj = new Syrup();
            obj.displayLabel();
        } else if (a==3) {
            Ointment obj=new Ointment();
            obj.displayLabel();
        }
    }
}
