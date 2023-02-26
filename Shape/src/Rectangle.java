public class Rectangle extends Shape {
    public double width;
    public double height;
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea () {
        return width * height;
    }
}