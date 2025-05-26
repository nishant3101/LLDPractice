import java.util.*;

public class PlayList{
    List<Music> originalMusicList;
    List<Music> currentMusicList;
    private int currentIndex=0;
    private boolean repeat=false;
    private boolean shuffle=false;
    private boolean repeatList=false;
    public PlayList(){
        originalMusicList= Arrays.asList(
          new Music("Artist1","Song1"),
          new Music("Artist2","Song2"),
          new Music("Artist3","Song3")
        );
        currentMusicList=originalMusicList;
        currentIndex=0;
    }

    public Music play(){
        if(currentIndex<0 || currentIndex>=currentMusicList.size()){
            return null;
        }
        return currentMusicList.get(currentIndex);
    }

    public Music next(){
        if(repeat){
            return play();
        }
        currentIndex++;
        if(currentIndex>=currentMusicList.size()){
            if(repeatList){
                currentIndex=0;
            }
            else{
                currentIndex=currentMusicList.size()-1;
            }

        }
        return play();
    }
    public Music back(){
        if(repeat){
            return play();
        }
        currentIndex--;
        if(currentIndex<0){
            currentIndex=0;
            return null;
        }
        return currentMusicList.get(currentIndex);
    }

    public boolean repeat(){
        repeat=!repeat;
        return repeat;
    }
    public boolean repeatList(){
        repeatList=!repeatList;
        return repeatList;
    }
    public boolean shuffle(){
        shuffle=!shuffle;
        if(shuffle){
            Collections.shuffle(currentMusicList);
        }
        else{
            currentMusicList=new ArrayList<>(originalMusicList);
        }
        currentIndex=0;
        return shuffle;
    }
    public List<Music> filterByArtist(String[] artists){
        Set<String> artistSet=new HashSet<>(Arrays.asList(artists));
        List<Music> filtered=new ArrayList<>();
        for(Music m:currentMusicList){
            if(artistSet.contains(m.artist)){
                filtered.add(m);
            }
        }
        return filtered;
    }


}
