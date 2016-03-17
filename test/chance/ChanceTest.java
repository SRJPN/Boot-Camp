package chance;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void chance_cant_be_created_with_value_greater_than_1() throws InvalidProbabilityException {
        exception.expect(InvalidProbabilityException.class);
        exception.expectMessage("Probability should be between 0 to 1 but got 2.0");
        Chance.create(2);
    }

    @Test
    public void chance_cant_be_created_with_value_lesser_than_0() throws InvalidProbabilityException {
        exception.expect(InvalidProbabilityException.class);
        exception.expectMessage("Probability should be between 0 to 1 but got -2.0");
        Chance.create(-2);
    }

    @Test
    public void chance_can_be_negated() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance expected = Chance.create(0.25);
        assertEquals(expected,chance.not());
    }

    @Test
    public void chance_can_be_ored() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance chance1 = Chance.create(0.25);
        Chance expected = Chance.create(1);
        assertEquals(expected,chance.or(chance1));
    }

    @Test
    public void chance_can_be_and() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance chance1 = Chance.create(0.25);
        Chance expected = Chance.create(0.1875);
        assertEquals(expected,chance.and(chance1));
    }
}