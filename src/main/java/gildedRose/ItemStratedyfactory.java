package gildedRose;

public class ItemStratedyfactory {
    public  static ItemStratedy createItemStratedy(String Itemname){
        switch (Itemname) {
            case "Aged Brie":
                return new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage();
            case "Sulfuras, Hand of Ragnaros":
                return  new Sulfuras();
            default:
                return new OtherItem();
        }
    }
}
