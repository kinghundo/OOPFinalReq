package exercise2;
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    //Constructors
    
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
       this.center = center;
       
    }
    public MyCircle(){
       center = new MyPoint(0,0);
       this.radius = 1;
    }
    
    //Methods
    public MyPoint getCenter() {
       return center;
    }
    public int getRadius() {    
        return radius;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public void setCenter(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x, y);
    }
    public double distance(MyCircle another) {
       return center.distance(another.center); // use distance() of MyPoint
    }
    public String toString(){
        return "My circle[radius="+radius+", center="+center.toString()
                +"]";
    }
    public double getCircumference(){
        return Math.PI*radius*2;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}

