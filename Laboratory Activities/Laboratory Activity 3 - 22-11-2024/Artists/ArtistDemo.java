public class ArtistDemo {
    public static void main(String[] args) {
  
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Sabrina Carpenter", "American", 25, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Bada Lee", "Korean", 29, "Music", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Writer writer = new Writer("Maxine Lat", "Filipino", 37, "Literature", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Vincent van Gogh", "Dutch", 37, "Art", Medium.OIL);
        painter.displayInfo();

    }
}
