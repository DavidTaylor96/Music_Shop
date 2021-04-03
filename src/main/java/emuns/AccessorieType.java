package emuns;

public enum AccessorieType {
    GUITAR_STRINGS(5),
    SHEET_MUSIC(10),
    MUSIC_STAND(40);


    private final int price;


    AccessorieType(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
