class OneBHK{
    int roomArea, hallArea, price;
    OneBHK(){
        roomArea = 150;
        hallArea = 200;
        price = 10000;
    }
    OneBHK(int r,int h, int p){
        roomArea = r;
        hallArea = h;
        price = p;
    }
    void show() {
        System.out.println("\nPrice - " + price);
        System.out.println("Hall Area - " + hallArea);
        System.out.println("Room Area - " + roomArea);
    }

}
class TwoBHK extends OneBHK{
    int room2Area;
    TwoBHK(){
        room2Area = 100;
    }
    TwoBHK(int r,int h, int p, int r2){
        super(r,h,p);
        room2Area = r2;
    }
    void show() {
        super.show();
        System.out.println("Room2 Area - " + room2Area);
    }

}

public class DriverClassBHK {
    public static void main(String [] args) {

        TwoBHK tb1 = new TwoBHK();
        TwoBHK tb2 = new TwoBHK(120, 150, 15000, 100);
        TwoBHK tb3 = new TwoBHK(200, 300, 2000, 150);

        tb1.show();
        tb2.show();
        tb3.show();

        int totalPrice= tb1.price+ tb2.price+tb3.price;

        System.out.println("\nTotal amount of all flats "+totalPrice);
    }


    }
