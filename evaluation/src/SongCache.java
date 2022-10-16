
import java.util.*;

//import static org.hamcrest.MatcherAssert.*;
//import static org.hamcrest.CoreMatchers.*;

public interface SongCache {
    void recordSongPlays(String songId, int numPlays);
    int getPlaysForSong(String songId);
    List<String> getTopNSongsPlayed(int n);
}
class ValueComparator implements Comparator<String> {

    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) return -1;
        return 1;
    }
    /*{
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }*/
}

class SongCacheImpl implements SongCache {
    private Map<String, Integer> songs=new HashMap<>();
    private Map<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(songs));

    //public SongCacheImpl() {
    //    songs = new HashMap<>();
    //    sortedMap = new TreeMap<>(new ValueComparator(songs));
    //}

    @Override
    //synchronized
    public void recordSongPlays(String songId, int numPlays) {
        if (songs.containsKey(songId)) {
            songs.put(songId, songs.get(songId) + numPlays);
        } else {
            songs.put(songId, numPlays);
        }
    }

    @Override
    //synchronized
    public int getPlaysForSong(String songId) {
        return songs.getOrDefault(songId, -1);
    }

    @Override
    //synchronized
    public List<String> getTopNSongsPlayed(int n) {
        sortedMap.putAll(songs);
        List<String> topNSongs = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> itr = sortedMap.entrySet().iterator();
        while (itr.hasNext() && n != 0) {
            Map.Entry<String, Integer> entry = itr.next();
            topNSongs.add(entry.getKey());
            n--;
        }
        return topNSongs;
    }
}
 class projectTest {
    public static void main(String[] args) {
        SongCache cache = new SongCacheImpl();
        cache.recordSongPlays("ID-1", 3);
        cache.recordSongPlays("ID-1", 1);
        cache.recordSongPlays("ID-2", 2);
        cache.recordSongPlays("ID-3", 5);
        System.out.print("should be 4, output is: ");
        System.out.println(cache.getPlaysForSong("ID-1"));
        System.out.print("should be -1, output is: ");
        System.out.println(cache.getPlaysForSong("ID-9"));
        System.out.print("should be ID-3, ID-1, output is: ");
        System.out.println(cache.getTopNSongsPlayed(2));
        System.out.print("should be [] output is: ");
        System.out.println(cache.getTopNSongsPlayed(0));
       // assertThat(cache.getPlaysForSong("ID-1"), is(4));
        //assertThat(cache.getPlaysForSong("ID-9"), is(-1));
        //assertThat(cache.getTopNSongsPlayed(2), contains("ID-3", "ID-1"));
        //assertThat(cache.getTopNSongsPlayed(0), is(empty()));
    }


 }