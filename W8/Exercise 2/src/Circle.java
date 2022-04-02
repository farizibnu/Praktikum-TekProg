public class Circle extends Shape{
    // private instance variable, not accessible from outside this class
    private double radius;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius */
    public Circle(){
        radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius */
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
    }

    public Circle(String color, double radius, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }


}
