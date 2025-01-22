public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int s) {
        if (s < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = s;
        }
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int s) {
        if (s < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = s;
        }
    }

    public int calculateSurfaceArea() {
        return 6 * this.side * this.side;
    }

    public int calculateVolume() {
        return this.side * this.side * this.side;
    }

    public String toString() {
        return "Cube{side=" + Integer.toString(this.side) + "}";
    }
}
