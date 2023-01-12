public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red");
        System.out.println(circle);
        System.out.println("Dien tich " + circle.getArea());

        Cylinder cylinder = new Cylinder(3, "green",4);
        System.out.println("\n"+cylinder);
        System.out.println("The tich " + cylinder.getVolume());

    }
}