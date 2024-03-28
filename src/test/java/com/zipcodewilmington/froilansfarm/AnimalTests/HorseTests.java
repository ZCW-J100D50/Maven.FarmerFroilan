package com.zipcodewilmington.froilansfarm.AnimalTests;

import org.junit.Assert;
import org.junit.Test;

public class HorseTests {

    @Test
    public void horseInheritanceTest1() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void horseInheritanceTest2() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void horseImplementationTest1() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof NoiseMaker);
    }

    @Test
    public void horseImplementationTest2() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Eater);
    }

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();
        String expectedNoise = "Neigh!";
        String actualNoise = horse.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest1() {
        Horse horse = new Horse();
        Corn corn = new Corn();
        boolean hasEaten = true;

        boolean result = horse.eat(corn, 3);

        Assert.assertTrue(result);
    }

    @Test
    public void eatTest2() {
        Horse horse = new Horse();
        Corn corn = new Corn();
        boolean hasEaten = false;

        boolean result = horse.eat(corn, 3);

        Assert.assertFalse(result);
    }

    @Test
    public void getIsMountedTest1() {
        Horse horse = new Horse();
        boolean isMounted = true;

        boolean result = horse.getIsMounted(isMounted);

        Assert.assertTrue(result);
    }

    @Test
    public void getIsMountedTest2() {
        Horse horse = new Horse();
        boolean isMounted = false;

        boolean result = horse.getIsMounted(isMounted);

        Assert.assertFalse(result);
    }

    @Test
    public void getIsBeingRiddenTest1() {
        Horse horse = new Horse();
        boolean isBeingRidden = true;

        boolean result = horse.getIsBeingRidden(isBeingRidden);

        Assert.assertTrue(result);
    }

    @Test
    public void getIsBeingRiddenTest2() {
        Horse horse = new Horse();
        boolean isBeingRidden = false;

        boolean result = horse.getIsBeingRidden(isBeingRidden);

        Assert.assertFalse(result);
    }

    @Test
    public void getIsDismountedTest1() {
        Horse horse = new Horse();
        boolean isDismounted = true;

        boolean result = horse.getIsDismounted(isDismounted);

        Assert.assertTrue(result);
    }

    @Test
    public void getIsDismountedTest2() {
        Horse horse = new Horse();
        boolean isDismounted = false;

        boolean result = horse.getIsDismounted(isDismounted);

        Assert.assertFalse(result);
    }

    @Test
    public void exerciseTest1() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer();

        farmer.mount(horse);
        boolean result = horse.exercise();

        Assert.assertTrue(result);
    }

    @Test
    public void exerciseTest2() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer();

        farmer.mount(horse);
        farmer.disMount(horse);
        boolean result = horse.exercise();

        Assert.assertFalse(result);
    }
}
