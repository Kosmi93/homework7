public class Main {
    public static void main(String[] args) {
        Author lukaynenko = new Author("Лукьяненко","Сергей","Васильевич");
        Author  pushkin= new Author("Пушкин","Александр","Сергеевич");
        Book dozor = new Book("Ночной дозор",lukaynenko,1998);
        Book sbornik = new Book("Капитанская дочка",pushkin,1936);
        System.out.println(dozor);
        System.out.println(sbornik);
        sbornik.setAgePublic(1836);
        System.out.println(sbornik);
    }
}