public class Solution {
    public static void main(String[] args) {
        Artist artist = Artist.getArtist();
        int i = 0;
        while (i != 10) {
            artist.drawAllFigure();
            i++;
        }
    }
}