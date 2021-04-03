package shops;
import behaviour.ISell;
import emuns.AccessorieType;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop{

    private String name;
    private int till;
    private ArrayList<ISell> stock;


    Shop(String name, int till, ArrayList<ISell> stock){
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public int getStockCount(){
        return stock.size();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public AccessorieType getAccessoriesType(AccessorieType accessorieType) {
        return accessorieType;
    }

    public int getAccessoriesTypePrice(AccessorieType accessorieType){
        return accessorieType.getPrice();
    }


    public void addToTill(int amount){
        till += amount;
    }

    public void removeFromTill(int amount){
        till -= amount;
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }
    public void addToStock(ISell item){
        stock.add(item);
    }

    public void sellInstrument(Instrument instrument){
        addToTill((int) instrument.getSellPrice());
        removeFromStock(instrument);
    }

    public void buyInstrument(Instrument instrument){
        stock.add(instrument);
        removeFromTill((int) instrument.getPrice());
    }

    public int calculateProfits(){
        int total = 0;
        for (ISell item: getStock()){
            total += item.getMakeUpPrice();
        }
        return total;
    }


}
