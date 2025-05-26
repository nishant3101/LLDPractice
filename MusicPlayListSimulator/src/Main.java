//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
A music playlist can be represented by a list of musics, where each music is composed by an artist and a name (both represented as strings).
Musics are played in the same order as the list goes, if no other musics are left then playlist will stop playing.
Playlist is hardcoded
It's expected that candidate implements some controls over a playlist to simulate an user listening to a playlist. Such commands are:
* play() - returns the current music
* next() - returns the next music
* back() - returns the previous music
* repeat() - toggle button that will change next() command to always play the current music - returns true/false depending on the state of the button
* repeatList() - toggle button that will change next() command to play first music on list once the list is over - returns true/false depending on the state of the button
* shuffle() - toggle button to shuffle the songs, now next() method will return the songs from shuffled list.
* filterByArtist(string[] artists) - given a list of artists, will return a playlist with all songs from those artists

Playlist:
-List<Musics>
- play(): if music is playing then return current else initialise and return the top of the list
- next(): if music is playing then return the next of the current else retrun the top
- back(): return the prev of current music
- repeat():
- repeatList():
Musics:
-Artist: string
-name: string
 */


import java.sql.Array;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PlayList pp=new PlayList();

        System.out.println("Now playing: "+pp.play());
        System.out.println("Play next: "+pp.next());
        System.out.println("Play prev: "+pp.back());
        System.out.println("Shuffle: "+pp.shuffle());
        System.out.println("Now playing: "+pp.play());

    }
}