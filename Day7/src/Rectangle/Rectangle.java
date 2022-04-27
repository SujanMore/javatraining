package Rectangle;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){

        return length * width;
    }

    public int getPerimeter(){
        return 2 * (length + width);

    }

    @Override
    public String toString(){
        return String.format(" Rectangle: length - %d, width - %d, area - %d, perimeter - %d.",
                getLength(), getWidth(), getArea(), getPerimeter());
    }
}
