public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        System.out.println(MathTools.randint(1, 10));
        System.out.println(MathTools.round(0, 77.46));

        Point a = new Point(MathTools.randint(2,9),MathTools.randint(4,12));
        Point b = new Point(MathTools.randint(2,9),MathTools.randint(4,12));

        System.out.println(b.getX());
        System.out.println(a.getY());

    
        Circle x = new Circle(MathTools.randint(1, 10), a);
        System.out.println(x.getArea());

        



        
    }
}
