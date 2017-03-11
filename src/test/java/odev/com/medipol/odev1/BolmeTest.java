package odev.com.medipol.odev1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BolmeTest {
	@Test
    public void shouldChamberInputs() {

        final Bolme bolme= new Bolme();

        float response = bolme.bolme(2,4);
        assertTrue(response == 0.5);

    }


    @Test
    public void shouldChamberInputsWithParams() {

        final Bolme bolme = new Bolme();

        float response = bolme.bolme(10, 5);
        assertTrue(response == 2);

    }

}
