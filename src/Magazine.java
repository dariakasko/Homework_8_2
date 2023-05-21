public class Magazine implements Printable{
    private String magazineName;
    private String magazineCategory;
    public void setMagazineName() {
        this.magazineName = magazineName;
    }
    public String getMagazineName() {
        return this.magazineName;
    }
    public void setMagazineCategory() {
        this.magazineCategory = magazineCategory;
    }
    public String getMagazineCategory() {
        return this.magazineCategory;
    }
    public Magazine(String magazineName, String magazineCategory) {
        this.magazineName = magazineName;
        this.magazineCategory = magazineCategory;
    }
    @Override
    public void print() {
        System.out.println("Magazine is printed");
    }
    public static void printMagazines(Printable[] printable) {
        for (Printable arrayElement : printable) {
            if (arrayElement.getClass() == Magazine.class) {
                System.out.println(((Magazine) arrayElement).magazineName);
            }
        }
    }
}
