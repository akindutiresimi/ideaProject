import geoPoliticalZone.GeoPoliticalZone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeoPOliticalZoneTest {

    @Test
    public void testThatTheStateIsInTheRightPoliticalZone(){

        GeoPoliticalZone geoPoliticalZone = new GeoPoliticalZone();
        assertEquals('SOUTH WEST', geoPoliticalZone.getZone("ondo"));
    }

}
