package edu.brown.cs32.points;

import java.util.Objects;

/**
 * A point in 2-dimensional space
 * (with both equals() and hashCode() defined)
 */
public class PointWithBoth {
    final double x;
    final double y;

    public PointWithBoth(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() { return x; }
    public double y() { return y; }

    // This was auto-generated by IntelliJ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointWithBoth that = (PointWithBoth) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0;
    }

    // This was auto-generated by IntelliJ
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
