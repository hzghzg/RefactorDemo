package gildedRose;

public class Sulfuras implements ItemStratedy{
    @Override
    public void update(Item item) {
        if (!item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0&&!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality--;
            }
        } else {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")&&item.quality < 50) {
                    if (item.sellIn < 11) {
                        item.quality++;
                    }
                    if (item.sellIn < 6) {
                        item.quality++;
                    }
                }
            }
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality > 0&&!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality--;
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                if (item.quality < 50) {
                    item.quality ++;
                }
            }
        }
    }
}
