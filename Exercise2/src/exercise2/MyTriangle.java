package exercise2;
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    //Constructors
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    public String toString(){
        return "MyTriangle[v1="+v1.getXY()+", v2="+v2.getXY()+", v3="+v3.getXY();
    }
    public double distanceP2P(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+
                Math.pow(p1.getY()-p2.getY(), 2));
    }
    public double getPerimeter(){
        return distanceP2P(v1,v2)+distanceP2P(v2,v3)+distanceP2P(v3,v1);
    }
    public String getType(){
        if(distanceP2P(v1,v2)==distanceP2P(v1,v3) && distanceP2P(v2,v3)==distanceP2P(v1,v2)){
            return "Equilateral";
        }
        else 
            if(distanceP2P(v1,v2)==distanceP2P(v1,v3)||distanceP2P(v1,v2)==distanceP2P(v2,v3)
                    ||distanceP2P(v1,v3)==distanceP2P(v2,v3)){
                return "Isoceles";
            }
            else{
                return "Scalene";
            }
    }
}
