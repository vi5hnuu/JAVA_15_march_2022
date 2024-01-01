package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album_I_innerClass {
    private String name;
    private String artist;
    private SongList songs;

    public Album_I_innerClass(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        System.out.println("Total tracks the album contains is " + this.songs.getNumberOfSongs());
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song requestedSong = songs.findSong(title);
        if (requestedSong != null) {
            playList.add(requestedSong);
            return true;
        }
        System.out.println("This album does not have a song " + title);
        System.out.println("Total tracks the album contains is " + this.songs.getNumberOfSongs());
        return false;
    }

    private class SongList { //when this is seperate class we have to make methods public and ctor public as well but now they can be private
                            //function specify to this class not to album class
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song))
                return false;
            this.songs.add(song);
            return true;
        }

        private int getNumberOfSongs(){
            return songs.size();
        }
        private Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}