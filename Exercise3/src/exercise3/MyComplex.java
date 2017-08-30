package exercise3;
public class MyComplex {
    private double real;
    private double imag;
    
    //Constructors
    public MyComplex(){
        
    }
    public MyComplex(double real, double imag){
         this.real=real;
         this.imag=imag;
    }

    //Methods
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    public String toString(){
        return "("+real+"+"+imag+"i)";
    }
    public boolean isReal(){
        if(imag==0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isImaginary(){
        if(imag!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean equals(double real, double imag){
        if(this.real==real&&this.imag==imag){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean equals(MyComplex another){
        if(this.real == another.real && this.imag == another.imag){
            return true;
        }
        else{
            return false;
        }
    }
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    public double argument(){
        return Math.atan2(imag, real);
    }
    
    public MyComplex add(MyComplex right){
        double realResult=real+right.getReal();
        double imagResult=imag+right.getImag();
        return this;
    }
    public MyComplex substract(MyComplex right){
        double realResult=real-right.getReal();
        double imagResult=imag-right.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right){
        double realResult=real+right.getReal();
        double imagResult=imag+right.getImag();
        return new MyComplex(realResult,imagResult);
    }
    public MyComplex substractNew(MyComplex right){
        double realResult=real-right.getReal();
        double imagResult=imag-right.getImag();
        return new MyComplex(realResult,imagResult);
    }
    public MyComplex multiply(MyComplex right){
        double realResult=(real*right.getReal())-(imag*right.getImag());
        double imagResult=(real*right.getImag())+(imag*right.getReal());
        return this;
    }
    public MyComplex divide(MyComplex right){
        double firstReal=(real*right.getReal())+(imag*right.getImag());
        double firstImag=(real*(-right.getImag()))+(imag*right.getReal());
        return this;
    }
    
}
