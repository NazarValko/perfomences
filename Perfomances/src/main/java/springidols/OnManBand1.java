package springidols;

import java.util.Collection;
import java.util.Map;

public class OnManBand1 implements Performer{
    public OnManBand1(){}

    @Override
    public void perform() throws Exception {
        for (String key : instruments.keySet()){
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
