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
}