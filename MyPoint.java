public class MyPoint{
    private int x;
    private int y;

    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return this.x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y)
    {
       setX(x);
       setY(y);
    }

    public String toString()
    {
        return ("(" + this.x + "," + this.y + ")");
    }
    public double distance(int x, int y)
    {
        int xDif = this.x - x;
        int yDif = this.y - y;
        return Math.sqrt(xDif*xDif + yDif*yDif);

    }

    public double distance(MyPoint point)
    {
        int xDif = this.x - point.x;
        int yDif = this.y - point.y;
        return Math.sqrt(xDif*xDif + yDif*yDif);

    }
    public double distance()
    {
        int xDif = this.x - 0;
        int yDif = this.y - 0;
        return Math.sqrt(xDif*xDif + yDif*yDif);

    }

}