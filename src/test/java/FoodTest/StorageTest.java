package FoodTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class StorageTest
{
//    Storage storage = new Storage();
    HashMap<String, Integer> storage = new HashMap<>();
    storage.put(apple, 5);
    storage.put(dragonfruit, 5);
    storage.put(earCorn, 5);
    storage.put(milkGallon, 5);
    storage.put(ruffletEgg, 5);
    storage.put(togepi, 5);
    storage.put(watermelon, 5);
    storage.put(tomato, 5);

    @Test
    public void testStoreAndRetrieve() {
        Assert.assertEquals(5, storage.get(apple));
    }
    @Test
    public void testAddWatermelon()
    {
        int stock = storage.get(watermelon);
        Assert.assertEquals(4, storage.put(watermelon, stock + 1));
    }
    @Test
    public void testRemoveDragonfruit()
    {
       int stock = storage.get(dragonfruit);
        Assert.assertEquals(4, storage.put(dragonfruit, stock - 1));
    }
    @Test
    public void testClearEarCorn()
    {
        storage.remove(earCorn);
        Assert.assertEquals(7, storage.size());
    }
    @Test
    public void testClear()
    {
        storage.clear();
        storage.put(apple, 1);
        Assert.assertEquals(1, storage.size());
    }
}
