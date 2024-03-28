package AnimalTests;
import org.junit.Assert;
import org.junit.Test;
public class CharizardTest {
    @Test
    public void constructorTest() {
        String name = "Charizard";
        String type = "Fire";
        Double id = 0.0006;

        Charizard charizard = new Charizard(name, type, id);

        String retrievedName = charizard.getName();
        String retrievedType = charizard.getType();
        Double retrievedId = charizard.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Charizard charizard = new Charizard(null, null, null);
        String expected = "Charizard";

        charizard.setName(expected);
        String actual = charizard.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Charizard charizard = new Charizard(null, null, null);
        String expected = "Fire";

        charizard.setType(expected);
        String actual = charizard.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Charizard charizard = new Charizard(null, null, null);
        Double expected = 0.0006;

        charizard.setId(expected);
        String actual = charizard.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Charizard charizard = new Charizard(null, null, null);
        Assert.assertTrue(charizard instanceof Animal);
    }
    @Test
    public void testInstanceOfRideable() {
        Charizard charizard = new Charizard(null, null, null);
        Assert.assertTrue(charizard instanceof Rideable);
    }
    @Test
    public void makeNoiseTest() {
        Charizard charizard = new Charizard(null, null, null);
        String expected = "RAWRRRRR!!!";
        String actual = bulbasaur.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void burnRowTest() {
        // Given
        Charizard charizard = new Charizard(null, null, null);

    }
}
