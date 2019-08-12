package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_14_when_updateQuality_given_a_normal_item_its_sellIn_is_15_quality_is_15(){
        Item item = new Item("small cake", 15, 15);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(14, item.quality);
        assertEquals(14,item.sellIn);
    }
    @Test
    public void should_return_14_and_0_when_updateQuality_given_a_normal_item_its_sellIn_is_15_quality_is_0(){
        Item item = new Item("small cake", 15, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0, item.quality);
        assertEquals(14,item.sellIn);
    }
}