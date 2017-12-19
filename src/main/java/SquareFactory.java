final class SquareFactory implements Factory {
    private Figure square;

    @Override
    public Figure createFigure() {
        square = new Square.SquareBuilder().build();
        return square;
    }
}