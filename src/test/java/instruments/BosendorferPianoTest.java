package instruments;

import emuns.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BosendorferPianoTest {

    BosendorferPiano bosendorferPiano;

    @Before
    public void setUp(){
        bosendorferPiano = new BosendorferPiano(1000, InstrumentType.PIANO, 88, "Grand Piano");
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, bosendorferPiano.getPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PIANO, bosendorferPiano.getInstrumentType());
    }

    @Test
    public void hasNumberOfString(){
        assertEquals(88, bosendorferPiano.getNumberOfKeys());
    }

    @Test
    public void hasGuitarType(){
        assertEquals("Grand Piano", bosendorferPiano.getPianoType());
    }

    @Test
    public void canPlayPiano(){
        assertEquals("Playing the Piano", bosendorferPiano.canPlay("Playing the Piano"));
    }

    @Test
    public void hasMarkupPrice(){
        assertEquals(200, bosendorferPiano.getMakeUpPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1200, bosendorferPiano.getSellPrice(), 0.0);
    }
}