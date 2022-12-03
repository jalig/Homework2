public class Main {
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 40;
        int a2 = 30;
        int b2 = 30;

        if (b1 < a2 || b2 < a1) {
            System.out.println("Пересечения нет");
        } else if (a1 >= a2 && b2 >= b1) {
            System.out.println(a1 + " " + b1);
        } else if (a2 < a1 && b1 > b2) {
            System.out.println(a1 + " " + b2);
        } else if (a2 > a1 && b1 < b2) {
            System.out.println(a2 + " " + b1);
        } else if (a1 == b2) {
            System.out.println(a1);
        } else if (b1 == a2) {
            System.out.println(a2);
        } else if (a1 <= a2 && b1 <= b2) {
            System.out.println(a2 + " " + b2);
        } else if (a1 > a2 && b1 < b2) {
            System.out.println(a1 + " " + b1);
        } else if (a1 < a2 && b1 > b2) {
            System.out.println(a2 + " " + b2);
        }
    }
}