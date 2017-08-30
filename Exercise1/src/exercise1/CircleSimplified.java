package exercise1;
public class CircleSimplified {
    private double radius;
    
    //Constructors
    public CircleSimplified(){
        radius = 1.0;
    }
    public CircleSimplified(double radius){
        this.radius = radius;
    }
    
    //methods
    public double getRadius() {
       return radius; 
    }
    public void setRadius(double radius) {
       this.radius = radius;
    }
    public double getArea() {
       return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }
    public String toStringSimplified() {
       return "Circle[radius=" + radius + "]";
    }
}
