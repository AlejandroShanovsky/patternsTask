final class RectangleFactory implements Factory {
    private Figure rectangle;

    @Override
    public Figure createFigure() {
        rectangle = new Rectangle(new Square.SquareBuilder().build());
        return rectangle;
    }
}