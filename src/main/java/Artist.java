import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Artist {
    private static Artist artist;
    private ArrayList<Figure> arrayOfFigure = new ArrayList<>();

    private Artist() {
    }

    {
        createArrayOfFigure();
    }

    public static Artist getArtist() {
        if (artist == null) {
            synchronized (Artist.class) {
                artist = new Artist();
            }
        }
        return artist;
    }

    public ArrayList<Figure> getArrayOfFigure() {
        return arrayOfFigure;
    }

    private void createArrayOfFigure() {
        Random random = new Random();
        Figure figure = null;
        Factory factory = null;
        int randomValue = 0;
        for (int i = 0; i < 100; i++) {
            randomValue = random.nextInt(4);
            factory = randomValue == 0 ? new CircleFactory() : randomValue == 1 ? new SquareFactory()
                    : randomValue == 2 ? new OvalFactory() : new RectangleFactory();
            arrayOfFigure.add(figure = factory.createFigure());
        }

    }

    public void drawFigure() {
        Scanner scanner = new Scanner(System.in);
        if (arrayOfFigure.isEmpty()) {
            System.out.println("No more figures! Creat new figures? Y/N");
            String choise = scanner.nextLine();
            if (choise.equals("Y")) createArrayOfFigure();
        } else {
            System.out.println("Choose type of figure!\n -Square \n -Circle \n -Oval \n -Rectangle");
            String choise = scanner.nextLine();
            for (int i = 0; i < arrayOfFigure.size(); ) {
                if (arrayOfFigure.get(i).getClassName().equalsIgnoreCase(choise)) {
                    arrayOfFigure.get(i).draw();
                    arrayOfFigure.remove(i);
                    return;
                } else i++;
            }
        }
    }

    public void drawAllFigure() {
        Scanner scanner = new Scanner(System.in);
        if (arrayOfFigure.isEmpty()) {
            System.out.println("No more figures! Creat new figures? Y/N");
            String choise = scanner.nextLine();
            if (choise.equals("Y")) createArrayOfFigure();
            else throw new NChoiseException();
        } else {
            for (int i = 0; i < arrayOfFigure.size(); ) {
                System.out.println(arrayOfFigure.get(i));
                arrayOfFigure.remove(i);
            }
        }
    }
}

class NChoiseException extends RuntimeException {
    public NChoiseException() {
        System.out.println("Good Buy!");
    }
}
