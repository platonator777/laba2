import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        out.println("Введите Фамилию");
//        String f = in.nextLine();
//        out.println("Введите Имя");
//        String s = in.nextLine();
//        out.println("Введите отчество");
//        String t = in.nextLine();
//
//        Name n = new Name(f, s, t);
//        out.println(n);

        //ЗАДАНИЕ 1

//        Name name1 = new Name("Клеопатра");
//        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
//        Name name3 = new Name("Маяковский", "Владимир");
//
//        out.println(name1);
//        out.println(name2);
//        out.println(name3);

        //ЗАДАНИЕ 2

//        ManWithName person1 = new ManWithName(name1, 152);
//        ManWithName person2 = new ManWithName(name2, 173);
//        ManWithName person3 = new ManWithName(name3, 189);
//
//        out.println(person1);
//        out.println(person2);
//        out.println(person3);

        //ЗАДАНИЕ 3


//        Name nameIvan = new Name("Чудов", "Иван");
//        Name namePetr = new Name(null, "Петр");
//        Name nameBoris = new Name(null, "Борис");
//
//        out.println("Первоначальные имена");
//        out.println(nameIvan);
//        out.println(namePetr);
//        out.println(nameBoris);
//        out.println("С родителями: ");
//        ManWithName ivan = new ManWithName(nameIvan, 180);
//        ManWithName petr = new ManWithName(namePetr, 175, ivan);
//        ManWithName boris = new ManWithName(nameBoris, 170, petr);
//
//        out.println(ivan);
//        out.println(petr);
//        out.println(boris);

        //ЗАДАНИЕ 4

//        Point StartPoint = new Point(1, 5);
//
//        Point[] points1 = {StartPoint, new Point(2, 8), new Point(5, 3)};
//        Polyline polyline1 = new Polyline(points1);
//
//        Point[] points2 = {StartPoint, new Point(2, -5), new Point(4, -8), new Point(5, 3)};
//        Polyline polyline2 = new Polyline(points2);
//
//        out.println("Первая ломаная: " + polyline1);
//        out.println("Вторая ломаная: " + polyline2);
//
//        out.println("Введите вектор на который сдвинуть точки");
//        int dx = getInt("dx: ");
//        int dy = getInt("dy: ");
//        polyline1.shiftStartPoint(dx, dy);
//
//        out.println("Первая ломаная после сдвига: " + polyline1);
//        out.println("Вторая ломаная после сдвига: " + polyline2);

        //ЗАДАНИЕ 5

//        int numPoints = 0;
//        numPoints = getInt("введите количество точек ломаной: ");
//
//        if (numPoints == 0) {
//            Polyline polyline = new Polyline();
//            out.println("Созданная пустая ломаная линия: " + polyline);
//        } else if (numPoints > 0) {
//            Point[] points = new Point[numPoints];
//
//            for (int i = 0; i < numPoints; i++) {
//                int x = 0, y = 0;
//                out.println("Введите координаты для точки #" + (i + 1) + ":");
//                x = getInt("x: ");
//                y = getInt("y: ");
//
//                points[i] = new Point(x, y);
//            }
//
//            Polyline polyline = new Polyline(points);
//
//            out.println("Созданная ломаная линия: " + polyline);
//        }


    //ЗАДАНИЕ 6

    Point[] points3 = {new Point(1, 5), new Point(2, 8), new Point(5, 3)};
    Polyline polyline3 = new Polyline(points3);
    out.println("Созданная ломаная линия: " + polyline3);

    out.println("Длина ломаной " + polyline3 + " равна: " + polyline3.calculateLength());
    Point[] newPoints = {new Point(5, 15), new Point(8, 10)};
    polyline3.addPoints(newPoints);

    out.println("Новая ломаная линия: " + polyline3);
    out.println("Длина новой ломаной " + polyline3 + " равна: " + polyline3.calculateLength());

    }

    private static int getInt(String prompt) {
        int number = 0;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            }
            else {
                System.out.println("Неправильный ввод введите целое число");
                scanner.next();
            }
        }
        return number;
    }

}