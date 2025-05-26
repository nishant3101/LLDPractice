public class Music {

    String artist;
    String name;

    public Music(String artist, String name){
        this.artist=artist;
        this.name=name;
    }
    @Override
    public String toString(){
        return name+" - "+artist;
    }
}
