class Oval implements Figure { //Wrapper under Square
    Circle figure;
    private String className = this.getClass().getName();

    public String getClassName() {
        return className;
    }

    public Oval(Figure figure) {
        if (figure instanceof Circle) {
            this.figure = (Circle) figure;
        }
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return figure.getX() + " " + figure.getY() + " " + figure.getRadius();
    }
}

