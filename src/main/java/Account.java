public class Account {
    private final String name;
    public Account(String name) throws NullPointerException {
        this.name = name;
    }
    public boolean checkNameToEmboss() {
        // Используем методы string для разбора строки Фамилия Имя
        return name.length() >= 3 && name.length() <= 19 && name.contains(" ") && !name.endsWith(" ") && !name.startsWith(" ") && name.split(" ").length == 2;
    }
}
