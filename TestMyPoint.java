public class TestMyPoint {
    
    public static void main(String[] args) {
        
        // MyPoint constructors
        MyPoint mp1 = new MyPoint();
        MyPoint mp2 = new MyPoint(2, 6);

        // get X point method
        System.out.println(" ");
        System.out.println("Get X");
        System.out.println("X point for MP1: " + mp1.getX());
        System.out.println("X point for MP2: " + mp2.getX());

        // set x point method & show updated x points
        mp1.setX(3);
        mp2.setX(2);
        System.out.println(" ");
        System.out.println("Set X");
        System.out.println("X point for MP1: " + mp1.getX());
        System.out.println("X point for MP2: " + mp2.getX());

        // get Y point method
        System.out.println(" ");
        System.out.println("Get Y");
        System.out.println("Y point for MP1: " + mp1.getY());
        System.out.println("Y point for MP2: " + mp2.getY());

        // set Y point method & show updated x points
        mp1.setY(9);
        mp2.setY(4);
        System.out.println(" ");
        System.out.println("Set Y");
        System.out.println("Y point for MP1: " + mp1.getY());
        System.out.println("Y point for MP2: " + mp2.getY());

        // set X & Y point method & show updated X & Y points
        mp1.setXY(6, 12);
        mp2.setXY(4, 8);
        System.out.println(" ");
        System.out.println("Set XY");
        System.out.println("Updated x,y points for MP1:" + mp1);
        System.out.println("Updated x,y points for MP2:" + mp2);

        // Get the distance from a given point, we will try 12,16
        System.out.println(" ");
        System.out.println("Distance from MP1 to (12,16): " + mp1.distance(12, 16));
        System.out.println("Distance from MP2 to (12,16): " + mp2.distance(12, 16));

        // Get the distance between two points
        System.out.println(" ");
        System.out.println("Distance from MP1 to MP2: " + mp1.distance(mp2));

        // Get the distance between this point and 0,0
        System.out.println(" ");
        System.out.println("Distance from MP1 to (0,0): " + mp1.distance());
        System.out.println("Distance from MP2 to (0,0): " + mp2.distance());
        System.out.println(" ");




    }
    
}
