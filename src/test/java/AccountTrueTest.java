import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTrueTest {
    @Parameterized.Parameter
    public String name;

    @Parameterized.Parameters
    public static Object[][] params() {
        return new Object[][]{
                {"Alexandr Tarasov"}, // обычное имя фамилия
                {"A T"}, //тесты граничные 3 и 19 символов
                {"Alexanders Tarasovs"}
        };
    }

    @Test
    @DisplayName("Проверка ввода валидного имени")
    public void checkNameTest() {
        Assert.assertTrue(new Account(name).checkNameToEmboss());
    }

}