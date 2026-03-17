interface MediaPlayer {
    void play(String audioType, String fileName);
}

class VlcPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public MediaAdapter() {
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}
