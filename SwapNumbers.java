public class SwapNumbers {
    int a,b;
    static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("value of A and B before swap "+a+" "+b);
    }
    static void swap(SwapNumbers s){
        int temp;
        temp=s.a;
        s.a=s.b;
        s.b=temp;
    }
    SwapNumbers(int x, int y){
        a=x;
        b=y;
    }

    public static void main(String [] args){
        int a=5;
        int b=6;
        System.out.println("Call By Value");
        System.out.println("value of A and B before swap "+a+"  "+b);
        swap(a,b);
        System.out.println("Call By Reference");
        SwapNumbers s1 = new SwapNumbers(5,6);
        System.out.println("value of A and B before swap "+s1.a+"  "+s1.b);
        swap(s1);
        System.out.println("value of A and B before swap "+s1.a+"  "+s1.b);
    }
}
