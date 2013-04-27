package dbfit.util.crypto;

import dbfit.util.crypto.CryptoService;
import dbfit.util.crypto.CryptoServiceFactory;

import org.junit.Test;
import org.junit.Before;

public class CryptoServiceTest {
    private CryptoService cryptoService;

    @Before
    public void prepare() {
        cryptoService = CryptoServiceFactory.getCryptoService();
    }

    @Test
    public void encryptedPasswordShouldNotContainOriginalOne() {
        CryptoServiceTests.encryptedPasswordShouldNotContainOriginalOne(
                cryptoService);
    }

    @Test
    public void encryptionShouldBeReversable() {
        CryptoServiceTests.encryptionShouldBeReversable(cryptoService);
    }
}

