/*
- Make a Shape class with a color attribute and a blank getArea() method
- Make a constructor for this class

- Make a Rectangle class that inherits from the Shape class
- Make width and height attributes
- Calculate the area with the getArea() method with actual formula
 */
public abstract class Shape {
    String color;
    abstract double getArea ();
    public Shape() {
        color = "Blue";
    }
    public Shape(String color) {
        this.color = color;
    }
}
