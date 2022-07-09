public class Praktikum {
    public static void main(String[] args) {
        Account account = new Account("Alexandr Tarasov");
        if (account.checkNameToEmboss()) System.out.println("Имя можно печатать на карте");
        else System.out.println("Имя нельзя печатать на карте");
    }
}