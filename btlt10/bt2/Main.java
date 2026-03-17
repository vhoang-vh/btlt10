public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();

        player.play("vlc", "song.vlc");
        player.play("mp3", "song.mp3");
    }
}