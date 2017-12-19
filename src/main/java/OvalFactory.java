final class OvalFactory implements Factory {
    private Figure oval;

    @Override
    public Figure createFigure() {
        oval = new Oval(new Circle.CircleBuilder().build());
        return oval;
    }
}