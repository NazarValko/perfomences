package springidols;

import java.util.Collection;

public class OnManBand implements Performer{
    public OnManBand(){}

    @Override
    public void perform() throws Exception {
        for (Instrument instrument : instruments){
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
