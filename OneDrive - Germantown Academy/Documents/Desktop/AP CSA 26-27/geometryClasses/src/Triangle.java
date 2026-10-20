public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c ;
    }

    public double getArea(){
        int x1 = a.getX();
        int x2 = b.getX();
        int x3 = c.getX();

        int y1 = a.getY();
        int y2 = b.getY();
        int y3 = c.getY();

        double a = 0.5 *((x1*y2 + x2*y3 + x3*y1)-(y1*x2 + y2*x3 + y3*x1));
        return MathTools.round(2, a);
}
}
