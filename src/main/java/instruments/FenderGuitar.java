package instruments;

import behaviour.IPlay;
import emuns.InstrumentType;

public class FenderGuitar extends Instrument{
    private int numberOfString;
    private String guitarType;

    public FenderGuitar(int price, InstrumentType instrumentType, int numberOfString, String guitarType) {
        super(price, instrumentType);
        this.numberOfString = numberOfString;
        this.guitarType = guitarType;
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public String getGuitarType() {
        return guitarType;
    }

}
