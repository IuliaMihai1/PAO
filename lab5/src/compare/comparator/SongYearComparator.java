package compare.comparator;

import java.util.Comparator;

public class SongYearComparator implements Comparator<Song> {
    @Override
    public int compare(Song song1, Song song2) {
        return Integer.compare(song1.getYear(), song2.getYear());
    }
}
