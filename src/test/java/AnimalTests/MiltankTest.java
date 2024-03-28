package AnimalTests;
import org.junit.Assert;
import org.junit.Test;

public class MiltankTest {
    @Test
    public void constructorTest() {
        String name = "Miltank";
        String type = "Normal";
        Double id = 0.0241;

        Miltank miltank = new Miltank(name, type, id);

        String retrievedName = miltank.getName();
        String retrievedType = miltank.getType();
        Double retrievedId = miltank.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Miltank miltank = new Miltank(null, null, null);
        String expected = "Miltank";

        miltank.setName(expected);
        String actual = miltank.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Miltank miltank = new Miltank(null, null, null);
        String expected = "Normal";

        miltank.setType(expected);
        String actual = miltank.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Miltank miltank = new Miltank(null, null, null);
        Double expected = 0.0241;

        miltank.setId(expected);
        String actual = miltank.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Miltank miltank = new Miltank(null, null, null);
        Assert.assertTrue(miltank instanceof Animal);
    }
    @Test
    public void testInstanceOfProduce() {
        Miltank miltank = new Miltank(null, null, null);
        Assert.assertTrue(miltank instanceof Produce);
    }
    @Test
    public void makeNoiseTest() {
        Miltank miltank = new Miltank(null, null, null);
        String expected = "mooooooooooo!!!";
        String actual = miltank.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void milkGallonTest(){
        if(hasBeenFertilized){
            MilkGallon milkGallon = new MilkGallon();
        }
    }
}
