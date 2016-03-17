package chance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void chance_of_getting_a_tail_on_flipping_a_coin_is_0point5() {
        Chance sampleSpace = Chance.createSampleSpace(new String[]{"HEAD", "TAIL"});
        assertEquals(0.5, sampleSpace.chanceOfGetting("tail"),0.0);
    }

    @Test
    public void chance_of_NOT_getting_a_tail_on_flipping_a_coin_is_0point5() {
        Chance sampleSpace = Chance.createSampleSpace(new String[]{"HEAD", "TAIL"});
        assertEquals(0.5, sampleSpace.chanceOfNotGetting("tail"),0.0);
    }

    @Test
    public void chance_of_getting_a_tail_on_flipping_a_coin_is_0point25() {
        Chance sampleSpace = Chance.createSampleSpace(new String[]{"HEAD HEAD", "TAIL HEAD","TAIL TAIL","HEAD TAIL"});
        assertEquals(0.25, sampleSpace.chanceOfGetting("tail tail"),0.0);
    }

    @Test
    public void chance_of_getting_at_least_one_tail_on_flipping_a_coin_is_0point75() {
        Chance sampleSpace = Chance.createSampleSpace(new String[]{"HEAD HEAD", "TAIL HEAD","TAIL TAIL","HEAD TAIL"});
        assertEquals(0.75, sampleSpace.chanceOfGetting("tail"),0.0);
    }
}