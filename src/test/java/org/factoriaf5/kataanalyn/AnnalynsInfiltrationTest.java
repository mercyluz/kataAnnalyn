package org.factoriaf5.kataanalyn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnnalynsInfiltrationTest {

    // Test para canFastAttack
    @Test
    public void testCanFastAttack() {
        assertTrue(AnnalynsInfiltration.canFastAttack(false));  // Caballero dormido
        assertFalse(AnnalynsInfiltration.canFastAttack(true));  // Caballero despierto
    }

    // Test para canSpy
    @Test
    public void testCanSpy() {
        assertTrue(AnnalynsInfiltration.canSpy(true, false, false));  // Caballero despierto
        assertTrue(AnnalynsInfiltration.canSpy(false, true, false));  // Arquero despierto
        assertTrue(AnnalynsInfiltration.canSpy(false, false, true));   // Prisionero despierto
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));  // Todos dormidos
    }

    // Test para canSignalPrisoner
    @Test
    public void testCanSignalPrisoner() {
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(false, true));  // Arquero dormido, prisionero despierto
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true, true));   // Arquero despierto, prisionero despierto
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(false, false));  // Ambos dormidos
    }

    // Test para canFreePrisoner
    @Test
    public void testCanFreePrisoner() {
        assertTrue(AnnalynsInfiltration.canFreePrisoner(false, false, true, true));  // Perro presente, arquero dormido
        assertFalse(AnnalynsInfiltration.canFreePrisoner(false, false, false, true)); // Prisionero dormido
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, false, true, false));  // Caballero despierto
        assertFalse(AnnalynsInfiltration.canFreePrisoner(false, true, true, false));  // Arquero despierto
        assertTrue(AnnalynsInfiltration.canFreePrisoner(false, false, true, false));  // Prisionero despierto, ambos dormidos
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, true, false, false));  // Ambos despiertos
    }
}
