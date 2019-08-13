package gildedRose;

public class Backstage implements ItemStratedy {
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
                if (item.sellIn < 11&&item.quality < 50) item.quality++;
                if (item.sellIn < 6&&item.quality < 50) item.quality++;
        }

        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) item.quality = 0;
    }
}
