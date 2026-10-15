public class MathTools {
    //Create the static MathTools methods in this file
    public static int randint(int min, int max){
        int range = max - min + 1;
        int r = (int)(Math.random() * range )+min;
        return r;
    }
    public static double round(int places, double number){
        number *= Math.pow(10, places);
        int rounded = (int)(number+0.5);
        return rounded / Math.pow(10, places);
    }

    public static double distance(Point a, Point b){
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double slope(Point a, Point b){
        return (double)(b.getY()-a.getY())/(b.getX()-a.getX());
    }

}

