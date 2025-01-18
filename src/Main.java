public class Main {
    public static void main(String[] args) {
        Book lordOfTheRings = new Book("Lord of the Rings", new Author("John", "Tolkien"
        ), 1954);
//        System.out.println("lordOfTheRings.bookTitle = " + lordOfTheRings.getBookTitle());
//        System.out.println("lordOfTheRings.getPublicationYear() = " + lordOfTheRings.getPublicationYear());
//        System.out.println("lordOfTheRings.getAuthor().getFirstName() = " + lordOfTheRings.getAuthor().getFirstName());
//        System.out.println("lordOfTheRings.getAuthor().getSurnName() = " + lordOfTheRings.getAuthor().getSurnName());
        System.out.println(lordOfTheRings);
        lordOfTheRings.setPublicationYear(1956);
        System.out.println("lordOfTheRings.getPublicationYear() = " + lordOfTheRings.getPublicationYear());
        System.out.println();
        Author spakowski = new Author("Andrzej", "Sapkowski");
        Book witcher = new Book("The Witcher", spakowski, 1986);
        System.out.println("witcher.getBookTitle() = " + witcher.getBookTitle());
        System.out.println("witcher.getPublicationYear() = " + witcher.getPublicationYear());
//        System.out.println("witcher.getAuthor().getFirstName() = " + witcher.getAuthor().getFirstName());
//        System.out.println("witcher.getAuthor().getSurnName() = " + witcher.getAuthor().getSurnName());
        System.out.println (spakowski);
    }


}
