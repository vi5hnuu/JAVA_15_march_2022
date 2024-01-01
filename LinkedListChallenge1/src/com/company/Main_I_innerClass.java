package com.company;

import java.util.*;

public class Main_I_innerClass {
private static List<Album_I> albums=new ArrayList<>();
    public static void main(String[] args) {
        Album_I album=new Album_I("Stromebringer","Deep Purple");
	album.addSong("Love dont mean a thing",4.6);
	album.addSong("Holy man",4.22);
	album.addSong("Hold on",4.3);
	album.addSong("Lady double delaer",5.6);
	album.addSong("You cant do it right",3.21);
	album.addSong("High balls shooter",6.23);
	album.addSong("The gypsy",4.27);
	album.addSong("Soldier of fortune",4.2);
	album.addSong("Stromebringer",3.13);
    albums.add(album);

    album =new Album_I("For those about to rock","AC/DC");
    album.addSong("For those about to rock",5.44);
    album.addSong("I put the finger on you",3.25);
    album.addSong("Leets go",3.45);
    album.addSong("Inject the venom",3.33);
    album.addSong("Snowboard",4.51);
    album.addSong("Evil wwalks",3.45);
    album.addSong("C.O.D",5.25);
    album.addSong("Breakng the rules",5.32);
    album.addSong("Night of the long knives",5.12);
    albums.add(album);

        List<Song> playList=new ArrayList<>();
        albums.get(0).addToPlayList("You cant do it right",playList);
        albums.get(0).addToPlayList("Hold on",playList);
        albums.get(0).addToPlayList("Sped king",playList);
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList);

        play(playList);


    }


    private static void play(List<Song> playList){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;

        ListIterator<Song> listIterator=playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playList");
            return;
        }
        else {
            System.out.println("Now playing "+listIterator.next());//toString();
            printMenu();
        }
        while(!quit){
            int action=scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("PlayList complete.");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext())
                            listIterator.next();

                        forward=true;
                    }
                    if(listIterator.hasNext())
                        System.out.println("Now playing "+listIterator.next());
                    else{
                        System.out.println("We have reached the end on playList");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious())
                            listIterator.previous();

                        forward=false;
                    }
                    if(listIterator.hasPrevious())
                        System.out.println("Now playing "+listIterator.previous());
                    else{
                        System.out.println("We are at the start of playList");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous());
                            forward=false;
                        }
                            else {
                            System.out.println("We are at start of playList");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+listIterator.next());
                            forward=true;
                        }
                        else {
                            System.out.println("We are at the end of playList");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        try {//unchecked exception
                            listIterator.remove();//call only once per next or previous..if no next prev done before or called twice for single next or prev it throw exception
                            System.out.println("Removed");
                        }catch (IllegalStateException ex){
                            System.out.println("Cannot identify current playing song");//if remove called twice(after next or prev operation) it throw exception
                            //at first call current playing song is removed
                            //at second call it throw exception(you have to play next if any to remove(must execute next or previous))
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions :");
        System.out.println("0- to quit"+"\n1- to play next song");
        System.out.println("2- to play previous song"+"\n3- to replay the current song");
        System.out.println("4- list songs in playlist");
        System.out.println("5- print avaiable actions.");
        System.out.println("6- Remove current song.");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> itr=playList.iterator();
        System.out.println("===========Songs===========");
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("=========== X-X ===========");
    }
}
