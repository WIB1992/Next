package HomeWork;

public class PhoneBookApi {

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Игорь", "8999111199");
        book.add("Настя", "8777777199");
        book.add("Валера", "8999222199");
        System.out.println(book.getNumber("Игорь"));
        System.out.println(book.getNumber("Настя"));
        System.out.println(book.getNumber("Валера"));
    }
}
