package Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptionTest {
    Decryption decryption;
    @BeforeEach
    void setUp() {
        decryption = new Decryption("DecryptMessage",3);
    }
    @Test
    public void Decryption_InstanceOf_true() {
        assertEquals(true, decryption instanceof  Decryption);
    }
    @Test
    void GetDecryptMessage_returnsDecryptMessage_String() {
        assertEquals("DecryptMessage",decryption.getDecryptMessage());
    }
    @Test
    void GetShiftKey_returnsShiftKey_Int() {
        assertEquals(3,decryption.getShiftKey());
    }

}