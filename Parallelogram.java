class Parallelogram implements Figure {
    private double base;
    private double height;
    private double side;

    public Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }
    public double getPerimeter() {
        return 2 * (base + side);
    }
    public double getArea() {
        return base * height;
    }

}

