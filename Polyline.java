import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private List<Point> points;

    Polyline() {
        this.points = new ArrayList<>();
    }

    Polyline(Point[] points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }

    void addPoints(Point[] points) {
        for (Point point : points) {
            this.points.add(point);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Линия [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    void shiftStartPoint(int dx, int dy) {
        if (points.size() > 0) {
            points.get(0).setX(points.get(0).getX() + dx);
            points.get(0).setY(points.get(0).getY() + dy);
        }
    }

    double calculateLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            length += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }
        return length;
    }
}

