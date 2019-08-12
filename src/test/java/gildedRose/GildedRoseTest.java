package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_14_and_14_when_updateQuality_given_small_cake_its_sellIn_is_15_quality_is_15(){
        Item item = new Item("small cake", 15, 15);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(14,item.sellIn);
        assertEquals(14, item.quality);
    }
    @Test
    public void should_return_14_and_0_when_updateQuality_given_small_cake_its_sellIn_is_15_quality_is_0(){
        Item item = new Item("small cake", 15, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(14,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_minus_1_and_13_when_updateQuality_given_small_cake_its_sellIn_is_0_quality_is_15(){
        Item item = new Item("small cake", 0, 15);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(13, item.quality);
    }
    @Test
    public void should_return_minus_1_and_0_when_updateQuality_given_small_cake_its_sellIn_is_0_quality_is_1(){
        Item item = new Item("small cake", 0, 1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_minus_1_and_15_when_updateQuality_given_Sulfuras_its_sellIn_is_minus_1_quality_is_15(){
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 15);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(15, item.quality);
    }
    @Test
    public void should_return_1_and_15_when_updateQuality_given_Sulfuras_its_sellIn_is_1_quality_is_15(){
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1, 15);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(1,item.sellIn);
        assertEquals(15, item.quality);
    }
    @Test
    public void should_return_minus_2_and_0_when_updateQuality_given_small_cake_its_sellIn_is_minus_1_quality_is_0(){
        Item item = new Item("small cake", -1, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-2,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_1_and_0_when_updateQuality_given_small_cake_its_sellIn_is_2_quality_is_0(){
        Item item = new Item("small cake", 2, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(1,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_minus_1_and_0_when_updateQuality_given_Sulfuras_its_sellIn_is_minus_1_quality_is_0(){
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_1_and_0_when_updateQuality_given_Sulfuras_its_sellIn_is_1_quality_is_0(){
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1, 0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(1,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_minus_1_and_0_when_updateQuality_given_Sulfuras_its_sellIn_is_0_quality_is_40(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_0_and_43_when_updateQuality_given_Sulfuras_its_sellIn_is_1_quality_is_40(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,item.sellIn);
        assertEquals(43, item.quality);
    }
    @Test
    public void should_return_minus_1_and_0_when_updateQuality_given_Sulfuras_its_sellIn_is_0_quality_is_48(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_0_and_50_when_updateQuality_given_Backstage_its_sellIn_is_1_quality_is_48(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,item.sellIn);
        assertEquals(50, item.quality);
    }
    @Test
    public void should_return_9_and_42_when_updateQuality_given_Backstage_its_sellIn_is_10_quality_is_40(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(9,item.sellIn);
        assertEquals(42, item.quality);
    }
    @Test
    public void should_return_minus_1_and_0_when_updateQuality_given_Backstage_its_sellIn_is_0_quality_is_49(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_0_and_50_when_updateQuality_given_Backstage_its_sellIn_is_1_quality_is_49(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0,item.sellIn);
        assertEquals(50, item.quality);
    }
    @Test
    public void should_return_10_and_11_when_updateQuality_given_Backstage_its_sellIn_is_11_quality_is_10(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(10,item.sellIn);
        assertEquals(11, item.quality);
    }
    @Test
    public void should_return_minus_1_and_42_when_updateQuality_given_Backstage_its_sellIn_is_0_quality_is_40(){
        Item item = new Item("Aged Brie", 0, 40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-1,item.sellIn);
        assertEquals(42, item.quality);
    }
}