public class Rectangle {
    private double length; // the length of the rectangle
    private double width; // the width of the rectangle

    public Rectangle()
{
     setLength( 1.0 );
     setWidth( 1.0 );
}
    public Rectangle( double theLength, double theWidth )
 {
     setLength( theLength );
     setWidth( theWidth );
 }
    public double getLength() {
        return length;
    }
    public void setLength( double theLength ) {
        length = ( theLength > 0.0 && theLength < 20.0 ? theLength : 1.0 );
    }
    public double getWidth() {
        return width;
    }
    public void setWidth( double theWidth ) {
        width = ( theWidth > 0 && theWidth < 20.0 ? theWidth : 1.0 );
    }
    public double perimeter() {
        return 2 * length + 2 * width;
    }
    public double area() {
        return length * width;
    }
    public String toString() {
        return String.format( "%s: %f\n%s: %f\n%s: %f\n%s: %f", "\nRectangle Length", length,
                "Rectangle Width" ,width, "Rectangle Perimeter", perimeter(), "Rectangle Area", area() );
    }
}
