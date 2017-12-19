class Rectangle implements Figure { //Wrapper under Square
    Square figure;
    private String className = this.getClass().getName();

    public String getClassName() {
        return className;
    }

    public Rectangle(Figure figure) {
        if (figure instanceof Square) {
            this.figure = (Square) figure;
        }
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return figure.getX() + " " + figure.getY() + " " + figure.getXside() + " " + figure.getYside();
    }

}
