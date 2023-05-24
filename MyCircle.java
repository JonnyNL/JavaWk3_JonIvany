public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle()
    {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius) {

        this.center = new MyPoint(x, y);
        this.radius = radius;
     }
    public MyCircle(MyPoint cen, int radius)
     {
        this.center = cen;
        this.radius = radius;
     }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
    return radius;
}
    public int getCenterX()
    {
        return this.center.getX();
    }
    public void setCenterX(int x)
    {
        this.center.setX(x);
    }
    public int getCenterY()
    {
        return this.center.getY();
    }
    public void setCenterY(int y)
    {
        this.center.setY(y);
    }
    public void setCenterXY(int x, int y)
    {
        this.center.setXY(x, y);
    }
    public int[] getCenterXY()
    {
        int[] arr = {0,0};

        arr[0] = this.center.getX();
        arr[1] = this.center.getY();

        return arr;
    }
    public String toString()
    {
        return ("Center = " + this.center + " Radius = " + this.radius);
    }
    public double getArea()
    {
        return (3.14*this.radius*this.radius);
    }
    public double getCircumference()
    {
        return (2 * this.radius* 3.14);
    }

    public double distance(MyCircle circle)
    {
        return (this.center.distance(circle.center));
    }
    

    
}

