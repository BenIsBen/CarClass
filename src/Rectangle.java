public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getDiagonal(){
        double end = (this.length * this.length) + (this.width * this.width);
        return Math.sqrt(end);
    }
    public boolean isSquare(){
        if(this.width == this.length){
            return true;
        }
        return false;
    }
}
