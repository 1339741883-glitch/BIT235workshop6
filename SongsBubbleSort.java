public class SongsBubbleSort {
    public static void main(String[] args) {
        String[] songs = {
                "Zebra Song", "Apple Tune", "Mountain Melody", "Rain Drop", "Ocean Wave",
                "Fire Dance", "Wind Story", "Blue Sky", "Night Star", "Golden Sun"
        };
        String[] artists = {
                "Artist Z", "Artist A", "Artist M", "Artist R", "Artist O",
                "Artist F", "Artist W", "Artist B", "Artist N", "Artist G"
        };

        // Bubble sort for song array (case‑insensitive alphabetical order)
        for(int i = 0; i < songs.length -1; i++){
            for(int j = 0; j < songs.length - 1 - i; j++){
                // Compare two song names alphabetically
                if(songs[j].compareToIgnoreCase(songs[j+1]) > 0){
                    // Swap song elements
                    String tempSong = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = tempSong;
                    // Swap matching artist elements
                    String tempArtist = artists[j];
                    artists[j] = artists[j+1];
                    artists[j+1] = tempArtist;
                }
            }
        }

        System.out.println("===== Songs (Alphabetical Order) =====");
        // Print sorted song‑artist list
        for (int i = 0; i < songs.length; i++) {
            System.out.printf("%d. Song: %s | Artist: %s%n", (i+1), songs[i], artists[i]);
        }
    }
}
