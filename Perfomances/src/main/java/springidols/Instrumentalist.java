package springidols;


public class Instrumentalist implements  Performer{
    public Instrumentalist(){}

    public void perform() throws Exception {
        System.out.println("Play " + song);
        instrument.play();
    }
    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
    public String screamSong(){
        return song;
    }
    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

}
