package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    private ItemStratedy itemStratedy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
    void updateQuality() {
        switch (name) {
            case "Aged Brie":
                itemStratedy = new AgedBrie();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemStratedy = new Backstage();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemStratedy = new Sulfuras();
                break;
            default:
                itemStratedy = new OtherItem();
                break;
        }
    }
}
