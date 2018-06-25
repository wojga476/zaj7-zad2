public class Student extends Person{

    private int oceny;
    private String obecnosc;

    public int getOceny() {
        return oceny;
    }

    public void setSredniaOcen(int oceny) {
        this.oceny = oceny;
    }

    public String getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(String obecnosc) {
        this.obecnosc = obecnosc;
    }

    public Student(String imie, String lastName, int oceny, String obecnosc) {
        super(imie, lastName);
        this.oceny = oceny;
        this.obecnosc = obecnosc;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Oceny: "+getOceny()+ " Obecność: "+getObecnosc());
    }
}
