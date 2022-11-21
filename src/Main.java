import com.cuong.demo.console.Rectangle;
import com.cuong.demo.console.Square;
import com.cuong.demo.console.Triangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.showInfo();

        Square square = new Square(4);
        square.showInfo();

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.showInfo();
    }
}