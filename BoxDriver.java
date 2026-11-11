public class BoxDriver {
    public static void main(String[] args) {
        // Create two Boxes objects for testing
        Boxes box1 = new Boxes(4);
        Boxes box2 = new Boxes(7);

        System.out.println("Box 1 size: " + box1);
        box1.draw();

        System.out.println("\nBox 2 size: " + box2);
        box2.draw();
    }
}
