import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SopaipletoSellerTest {
    SopaipletoSeller s;
    @BeforeEach
    void setUp() {
        s = new SopaipletoSeller(250, 1000);
    }

    @AfterEach
    void tearDown() {
        s = null;
    }

    @Test
    void getVuelto() {
        assertEquals(-1,s.getVuelto(500,10));
    }
    @Test
    void getVuelto2() {
        assertEquals(0,s.getVuelto(30000,100000000));
    }

    @Test
    void getValue3() {
        assertEquals(-2,s.getVuelto(30000000,0));
    }

    @Test
    void isStock() {
        assertTrue(s.isStock(1000));
    }
    @Test
    void isStock2(){
        assertFalse(s.isStock(500000));
    }
    @Test
    void isStock3(){
        assertTrue(s.isStock(SopaipletoSeller.getStock()));
    }
    @Test
    void enoughMoney(){
        assertTrue(s.enoughMoney(500,125000));
    }
    @Test
    void enoughMoney2(){
        assertFalse(s.enoughMoney(500,10));
    }

}