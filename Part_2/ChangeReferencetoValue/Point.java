package CodeSmells_lab_6.Part_2.ChangeReferencetoValue;

public class Point {
    private ImmutablePoint point;

    public Point(int x, int y) {
        this.point = new ImmutablePoint(x, y);
    }

    public int getX() {
        return point.getX();
    }

    public int getY() {
        return point.getY();
    }
}

