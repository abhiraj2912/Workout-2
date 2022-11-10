public class InstanceCounter {
    static int active, created,deleted;
    InstanceCounter(){
        active++;
        created++;
    }
public static void main(String [] args){
        InstanceCounter i1=new InstanceCounter();
        InstanceCounter i2=new InstanceCounter();
        InstanceCounter i3=new InstanceCounter();
        InstanceCounter i4=new InstanceCounter();
        InstanceCounter i5=new InstanceCounter();

        i1=null;
        i2=null;
        i3=null;
        System.gc();
        System.out.println("Number of created objects "+created);
        System.out.println("Number of active objects "+active);
        System.out.println("Number of deleted objects "+deleted);

}

 protected void finalize (){
        active --;
        deleted++;
}
}
