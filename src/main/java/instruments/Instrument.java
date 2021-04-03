package instruments;

import behaviour.IPlay;
import behaviour.ISell;
import emuns.InstrumentType;

public abstract class Instrument implements IPlay, ISell {

    private int price;

    private InstrumentType instrumentType;

    public Instrument(int price, InstrumentType instrumentType) {
        this.price = price;
        this.instrumentType = instrumentType;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String canPlay(String play) {
        return play;
    }

    public double getMakeUpPrice() {
        return price * 0.2;
    }

    public double getSellPrice(){
        return price + getMakeUpPrice();
    }



}
