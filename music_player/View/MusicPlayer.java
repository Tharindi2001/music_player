package View;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasun
 */
public class MusicPlayer {

    private SongNode head;
    private int size;

    private class SongNode {

        private Song song;
        private SongNode next;

        public SongNode(Song song) {
            this.song = song;
            this.next = null;
        }
    }

    public MusicPlayer() {
        this.head = null;
        this.size = 0;
    }

    public void addSong(Song song) {
        SongNode newNode = new SongNode(song);

        if (head == null) {
            head = newNode;
        } else {
            SongNode currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        size++;
    }

    public void removeSong(Song song) {
        if (head == null) {
            return;
        }

        if (head.song.equals(song)) {
            head = head.next;
            size--;
            return;
        }

        SongNode currNode = head;
        SongNode prevNode = null;
        while (currNode != null) {
            if (currNode.song.equals(song)) {
                prevNode.next = currNode.next;
                size--;
                return;
            }

            prevNode = currNode;
            currNode = currNode.next;
        }
    }

    public List<File> play() {

        if (head == null) {
            System.out.println("No songs in the playlist");
            return null;
        } else {
            List<File> songs = new ArrayList<>();
            SongNode curNode = head;
            while (curNode.next != null) {

                songs.add(curNode.song.getPath());
                curNode = curNode.next;
            }
            songs.add(curNode.song.getPath());
            return songs;
        }

    }

    public int getSize() {
        return size;
    }
}
