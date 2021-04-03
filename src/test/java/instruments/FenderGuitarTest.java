package instruments;

import emuns.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FenderGuitarTest {

    FenderGuitar fenderGuitar;


    @Before
    public void setUp(){
        fenderGuitar = new FenderGuitar(500, InstrumentType.GUITAR, 6, "Electric");
    }

    @Test
    public void hasPrice(){
        assertEquals(500, fenderGuitar.getPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.GUITAR, fenderGuitar.getInstrumentType());
    }

    @Test
    public void hasNumberOfString(){
        assertEquals(6, fenderGuitar.getNumberOfString());
    }


    @Test
    public void hasGuitarType(){
        assertEquals("Electric", fenderGuitar.getGuitarType());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Playing the Guitar", fenderGuitar.canPlay("Playing the Guitar"));
    }

    @Test
    public void hasMarkup(){
        assertEquals(100, fenderGuitar.getMakeUpPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(600, fenderGuitar.getSellPrice(), 0.0);
    }

}