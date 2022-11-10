class Tile{
    int tileLength;
    Tile(int x){
        tileLength = x;
    }
}

class Floor{
   int floorLength, floorWidth, tLen, tNum;

   Floor(int l,int w){
       floorLength = l;
       floorWidth = w;
   }
   int totalTiles(Tile t1){

       tLen=t1.tileLength;
       tNum=(floorLength*floorWidth)/(tLen*tLen);
       return tNum;
   }
}

public class TileCalculator {
    public static void main(String [] args){

        Tile t1=new Tile(10);

        Floor f1=new Floor(100,200);
        System.out.println("Total number of Tiles required "+f1.totalTiles(t1));
    }
}
