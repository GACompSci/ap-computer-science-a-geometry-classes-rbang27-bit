public class Circle {
    private int r;
    private Point center;

    public Circle(int r, Point center){
        this.r = r;
        this.center = center;
    }

    public int getRadius(){
        return r;
    }

    public double getArea(){
        double a = Math.PI * Math.pow(r, 2);
        return MathTools.round(2, a);
    }

}