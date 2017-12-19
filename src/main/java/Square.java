class Square implements Figure {
    private int x;
    private int y;
    private int Xside;
    private int Yside;
    Point point = new Point(x, y);

    private String className = this.getClass().getName();

    public String getClassName() {
        return className;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXside(int xside) {
        Xside = xside;
    }

    public void setYside(int yside) {
        Yside = yside;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXside() {
        return Xside;
    }

    public int getYside() {
        return Yside;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return x + " " + y + " " + Xside + " " + Yside;
    }

    static class SquareBuilder {
        private int x = 0;
        private int y = 0;
        private int Xside = 5;
        private int Yside = 5;
        private int radius = 5;

        public SquareBuilder setX(int x) {
            this.x = x;
            return this;
        }

        public SquareBuilder setY(int y) {
            this.y = y;
            return this;
        }

        public SquareBuilder setXside(int Xside) {
            this.Xside = Xside;
            return this;
        }

        public SquareBuilder setYside(int Yside) {
            this.Yside = Yside;
            return this;
        }

        public Square build() {
            Square square = new Square();
            square.setX(x);
            square.setY(y);
            square.setXside(Xside);
            square.setYside(Yside);
            return square;
        }
    }
}