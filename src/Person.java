public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName= firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public void setNazwisko(String lastName) {
        this.lastName = lastName;
    }

    public void showInfo(){
        System.out.print("Imie: "+ getFirstName()+" Nazwisko: "+getLastName());
    }
}
