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
}