package shops;

import behaviour.ISell;
import emuns.AccessorieType;
import emuns.InstrumentType;
import instruments.BosendorferPiano;
import instruments.FenderGuitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class ShopTest {

    FenderGuitar fenderGuitar;
    BosendorferPiano bosendorferPiano;
    Shop shop;

    ArrayList<ISell> stock;

    @Before
    public void before(){
        fenderGuitar = new FenderGuitar(500, InstrumentType.GUITAR, 6, "Electric");
        bosendorferPiano = new BosendorferPiano(1000, InstrumentType.PIANO, 88, "Grand Piano");

        stock = new ArrayList<>();
        Collections.addAll(stock, fenderGuitar, bosendorferPiano);

        shop = new Shop("Music Shop", 2000, stock);
    }

//--------------------------get what is in the shop ---------------------------------------------
    @Test
    public void hasName(){
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(2000, shop.getTill());
    }
    @Test
    public void hasStockCount(){
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(fenderGuitar);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.removeFromStock(fenderGuitar);
        assertEquals(1, shop.getStockCount());
    }

    //-------------------------can sell but instruments----------------------------
    @Test
    public void canSellInstrument(){
        shop.sellInstrument(fenderGuitar);
        assertEquals(2600, shop.getTill());
    }
    @Test
    public void canBuyInstrument(){
        shop.buyInstrument(bosendorferPiano);
        assertEquals(1000, shop.getTill());
    }


//--------------------Get Accessories and there price----------------------------------------
    @Test
    public void hasGuitarStrings(){
        assertEquals(AccessorieType.GUITAR_STRINGS, shop.getAccessoriesType(AccessorieType.GUITAR_STRINGS));
    }

    @Test
    public void getGuitarStringPrice(){
        assertEquals(5, shop.getAccessoriesTypePrice(AccessorieType.GUITAR_STRINGS));
    }


    //----------------------get Profit-----------------------------------------------
    @Test
    public void canGetProfit(){
        assertEquals(300, shop.calculateProfits());
    }

}