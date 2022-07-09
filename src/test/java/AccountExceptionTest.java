import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountExceptionTest {
    @Test(expected = Exception.class)
    @DisplayName("Проверка NullPointException")
    public void checkNameTest() {
        Assert.assertFalse(new Account(null).checkNameToEmboss());
    }
}