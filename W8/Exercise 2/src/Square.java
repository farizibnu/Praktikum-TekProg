public class Square extends Rectangle{
    private double side;

    public Square(){
        super();
    }

    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }

    public Square(double side, String color, boolean filled){
        super(side,side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
