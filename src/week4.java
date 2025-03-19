import java.text.MessageFormat;
import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;
    private double area;


    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

    }

    public void ComputeField() {
        area = length * width;
    }
    public void fieldDisplay() {
        "The given length of the rectangle is {0}"
        System.out.println(MessageFormat.format(pattern:"The given length of the rectangle is {0}");
        System.out.println("The area of the field is: " + area);
    }
}

