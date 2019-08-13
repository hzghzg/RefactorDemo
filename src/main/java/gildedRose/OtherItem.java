package gildedRose;

public class OtherItem implements ItemStratedy {
    @Override
    public void update(Item item) {
            if (item.quality > 0) item.quality--;
            item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0&&item.quality > 0)  item.quality--;

    }
}
