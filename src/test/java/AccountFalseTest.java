import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountFalseTest {
    @Parameterized.Parameter
    public String name;

    @Parameterized.Parameters
    public static Object[][] params() {
        return new Object[][]{
                {" Alexandr Tarasov"}, //проверяем лишние пробелы
                {" Alexandr Tarasov "},
                {"Alexandr Tarasov "},
                {"AlexandrTarasov"}, //проверяем отсутствие пробела между именем и фамилией
                {" AlexandrTarasov "},
                {" AlexandrTarasov"},
                {"AlexandrTarasov "},
                {"Alexanders Tarasovss"}, //больше 19 символов
                {"Al"}, //меньше 3х символов
                {""}  //пустая строка
        };
    }

    @Test
    @DisplayName("Проверка ввода не валидного имени")
    public void checkNameTest() {
        Assert.assertFalse(new Account(name).checkNameToEmboss());
    }
}