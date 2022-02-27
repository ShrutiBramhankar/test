package NSE;

public class Rectangle {
    int area,length,breadth;
    Rectangle(){
        length=20;
        breadth=10;
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    void calculateArea(){
        area=length*breadth;
        System.out.println(""+area);
    }
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(15,15);
        System.out.println("Area of rectangle with default Construtctor");
        r1.calculateArea();
        System.out.println("Area of rectangle with parametrized Constructor" );
        r2.calculateArea();
    }
}
