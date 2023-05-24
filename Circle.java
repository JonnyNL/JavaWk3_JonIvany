public class Circle{
    private double radius = 1;
    private String color = "red";

    public Circle(){
        this.radius = 1;
        this.color = "red";
    };

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return("Circle[radius=" + radius + " ,color=" + color);
    }

    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}