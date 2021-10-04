import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorSopaipillaTest {
    VendedorSopaipilla s;
    @BeforeEach
    void setUp() {
        s = new VendedorSopaipilla(250, 1000);
    }

    @AfterEach
    void tearDown() {
        s = null;
    }

    @Test
    void getVuelto() {
        assertEquals(-1, VendedorSopaipilla.getVuelto(500,10));
    }
    @Test
    void getVuelto2() {
        assertEquals(0, VendedorSopaipilla.getVuelto(30000,100000000));
    }

    @Test
    void getValue3() {
        assertEquals(-2, VendedorSopaipilla.getVuelto(30000000,0));
    }

    @Test
    void isStock() {
        assertTrue(VendedorSopaipilla.isStock(1000));
    }
    @Test
    void isStock2(){
        assertFalse(VendedorSopaipilla.isStock(500000));
    }
    @Test
    void isStock3(){
        assertTrue(VendedorSopaipilla.isStock(VendedorSopaipilla.getStock()));
    }
    @Test
    void enoughMoney(){
        assertTrue(VendedorSopaipilla.enoughMoney(500,125000));
    }
    @Test
    void enoughMoney2(){
        assertFalse(VendedorSopaipilla.enoughMoney(500,10));
    }

}