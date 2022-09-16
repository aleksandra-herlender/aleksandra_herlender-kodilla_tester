public class Calculator {

    static double PI = 3.1415927;
    static int counter = 0;



    public Calculator() {
        counter++;
    }


    public double add(double a, double b) {
        return a+b;
    }


    public double add2(double a){
        return add(a,2);
    }

    public  double sub(double a, double b) {
        return a-b;
    }

    public double circleArea(double r) {
        return PI  * r * r;
    }

    public double circlePerimeter(double r) {
        return  2 * PI * r;
    }
}
