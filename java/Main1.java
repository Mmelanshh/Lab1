public class Main1 {
 public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    Point point = new Point(x, y);
    point.print();
    System.out.println(point);
 }
}
