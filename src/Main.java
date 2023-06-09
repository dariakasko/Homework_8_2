// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pride and prejudice", "Jane Austen");
        Book book2 = new Book("Matilda", "Roald Dahl");
        Magazine magazine1 = new Magazine("Vogue", "Fashion");
        Magazine magazine2 = new Magazine("Drive", "Automobiles");

        Printable[] arrayOfCorrespondense = new Printable[4];
        arrayOfCorrespondense[0] = book1;
        arrayOfCorrespondense[1] = book2;
        arrayOfCorrespondense[2] = magazine1;
        arrayOfCorrespondense[3] = magazine2;

        for (Printable arrayElement : arrayOfCorrespondense) {
            arrayElement.print();
        }
        Magazine.printMagazines(arrayOfCorrespondense);
        Book.printBooks(arrayOfCorrespondense);
    }
}