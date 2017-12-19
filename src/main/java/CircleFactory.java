final class CircleFactory implements Factory {
    private Figure circle;

    @Override
    public Figure createFigure() {
        circle = new Circle.CircleBuilder().build();
        return circle;
    }
}
