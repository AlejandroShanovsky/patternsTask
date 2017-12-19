class Circle implements Figure {
    private int x;
    private int y;
    private int radius;
    Point point = new Point(x, y);
    private String className = this.getClass().getName();

    public String getClassName() {
        return className;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return x + " " + y + " " + radius;
    }

    static class CircleBuilder {
        private int x = 0;
        private int y = 0;
        private int radius = 5;

        public CircleBuilder setX(int x) {
            this.x = x;
            return this;
        }

        public CircleBuilder setY(int y) {
            this.y = y;
            return this;
        }

        public CircleBuilder setRaduis(int radius) {
            this.radius = radius;
            return this;
        }

        public Circle build() {
            Circle circle = new Circle();
            circle.setX(x);
            circle.setY(y);
            circle.setRadius(radius);
            return circle;
        }
    }
}
