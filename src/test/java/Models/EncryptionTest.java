package Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {
    Encryption encryption;
    @BeforeEach
    void setUp() {
        encryption = new Encryption("MORINGA",2);
    }
    @Test
    public void Encryption_instanceOf_true() {
        assertEquals(true, encryption instanceof Encryption);
    }
    @Test
    public void GetEncryptText_GetsEncryptedText_String() {
        assertEquals("MORINGA", encryption.getMessage());
    }
    @Test
    public void GetShift_GetsTHEShift_int() {
        assertEquals(2, encryption.getShiftKey() );
    }


}

