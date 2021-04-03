package instruments;

import behaviour.IPlay;
import emuns.InstrumentType;

public class BosendorferPiano extends Instrument{

    private int numberOfKeys;
    private String pianoType;

    public BosendorferPiano(int price, InstrumentType instrumentType, int numberOfKeys, String pianoType) {
        super(price, instrumentType);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getPianoType() {
        return pianoType;
    }


}
