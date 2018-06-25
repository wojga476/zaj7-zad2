public class Teacher extends Person{

    private int numNauczyciela;

    public int getNumNauczyciela() {
        return numNauczyciela;
    }

    public void setNumNauczyciela(int numNauczyciela) {
        this.numNauczyciela = numNauczyciela;
    }

    public Teacher(String firstName, String lastName, int numNauczyciela) {
        super(firstName, lastName);
        this.numNauczyciela = numNauczyciela;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Numer nauczyciela: "+ getNumNauczyciela());
    }
}
