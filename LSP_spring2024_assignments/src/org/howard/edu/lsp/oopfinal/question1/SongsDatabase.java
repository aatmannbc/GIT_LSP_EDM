package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Keeps track of songs by genre using a HashMap.
 */
public class SongsDatabase {

    private Map<String, Set<String>> map = new HashMap<>();

    // Add a song to a genre
    public void addSong(String genre, String songTitle) {
        map.computeIfAbsent(genre, k -> new HashSet<>()).add(songTitle);
    }

    // Get the genre for a given song
    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Get the set of songs for a genre
    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }
}