public class ComplexNumber {
    double realPart;
    double imaginaryPart;


    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void add(ComplexNumber c){
        realPart+=c.realPart;
        imaginaryPart+=c.imaginaryPart;
    }

    public void multiply(ComplexNumber c){
        double realtemp=realPart;

        realPart=(realPart*c.realPart - imaginaryPart*c.imaginaryPart);
        imaginaryPart=(imaginaryPart*c.realPart + realtemp*c.imaginaryPart);
    }

    public void rest(ComplexNumber c){
        realPart-=c.realPart;
        imaginaryPart-=c.imaginaryPart;
    }

    public void div(ComplexNumber c){
        double x=c.realPart*c.realPart + c.imaginaryPart*c.imaginaryPart;
        double realtemp=realPart;

        realPart=(realPart*c.realPart + imaginaryPart*c.imaginaryPart)/x;
        imaginaryPart=(imaginaryPart*c.realPart - realtemp*c.imaginaryPart)/x;
    }

    public double modull(){
        double m = Math.sqrt(realPart*realPart + imaginaryPart*imaginaryPart);
        return m;
    }

    public void conjugate(){
        imaginaryPart*=-1;
    }

    public void to_polar(){
        double p=phase();
        realPart=modull();
        imaginaryPart=p;
    }

    public void to_cartesian(){
        double realtemp=realPart;
        realPart=realPart*Math.cos(imaginaryPart);
        imaginaryPart=realtemp*Math.sin(imaginaryPart);
    }

    public double phase(){
        double f = Math.atan(imaginaryPart/realPart);
        return f;
    }

}
