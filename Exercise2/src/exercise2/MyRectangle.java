package exercise2;
public class MyRectangle {
    private MyPoint tl;
    private MyPoint br;
    private double area=Math.abs(tl.getX()-br.getX())*Math.abs(tl.getY()-br.getY());
    //Constructors
    public MyRectangle(MyPoint p1, MyPoint p2){
        this.tl=p1;
        this.br=p2;
    }
    
    //Methods
    
    public String toString(){
        return "MyRectangle[point1="+tl.getXY()+", point2="+br.getXY()+
                ", Area="+area;
    }
}
