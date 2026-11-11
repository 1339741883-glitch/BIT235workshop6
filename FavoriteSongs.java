public class FavoriteSongs {
    public static void main(String[] args) {
        // Array stores 10 favourite song names
        String[] songs = {
                "Song1", "Song2", "Song3", "Song4", "Song5",
                "Song6", "Song7", "Song8", "Song9", "Song10"
        };
        // Array stores corresponding artist names
        String[] artists = {
                "Artist A", "Artist B", "Artist C", "Artist D", "Artist E",
                "Artist F", "Artist G", "Artist H", "Artist I", "Artist J"
        };

        System.out.println("===== My Favorite Songs =====");
        // Loop through array and print song and artist
        for (int i = 0; i < songs.length; i++) {
            System.out.printf("%d. Song: %s | Artist: %s%n", (i+1), songs[i], artists[i]);
        }
    }
}