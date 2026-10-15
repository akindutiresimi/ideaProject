package myMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyMapTest {
    private MyMap map;

    @BeforeEach
    public void startWith() {
        map = new MyMap();
    }

    @Test
    public void testThatTheMapExist() {
        assertEquals(0, map.size());
    }

    @Test
    public void testThatTheMapAddAValueAndAKeyInItAndTheValueIsGottenBack() {
        map.put("moni", 20);
        assertEquals(20, map.get("moni"));
    }

    @Test
    public void testThatIAddedTwoValueAndICanGetThemBack() {
        map.put("moni", 20);
        map.put("tobi", 23);
        map.put("tosin", 56);
        assertEquals(56, map.get("tosin"));
        assertEquals(23, map.get("tobi"));
    }

    @Test
    public void testThatItShowTheNumberOfSize() {
        assertEquals(0,map.size());
    }

    @Test
    public void testThatICanRemoveAGiveValueFromTheMap() {
        map.put("moni", 20);
        map.put("tobi", 23);
        map.put("tosin", 56);
        assertEquals(23, map.remove("tobi"));
    }

}
