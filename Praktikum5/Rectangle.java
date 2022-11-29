package praktikum5.soal1;

public class Rectangle extends Shape{
    private double length, width; //radius in feet
    //----------------------------------
    // Constructor: Sets up the Rectangle.
    //----------------------------------
    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }
    //-----------------------------------------
    // Returns the surface area of the Rectangle.
    //-----------------------------------------
    @Override
    public double area(){
        return length * width;
    }
    //-----------------------------------
    // Returns the Rectangle as a String.
    //-----------------------------------   
    @Override
    public String toString(){
        return super.toString() + " of length " + length 
                + " and width " + width;
    }
}
