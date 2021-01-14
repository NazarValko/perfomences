package springidols;

import java.util.Map;
import java.util.Properties;

public class OnManBand2 implements Performer{
    public OnManBand2(){}

    @Override
    public void perform() throws Exception {
        for (String key : instruments.keySet()){
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}
