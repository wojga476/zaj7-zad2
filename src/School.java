public class School {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jan", "Kowalski", 21);
        teacher.showInfo();
        Student student = new Student("Wojciech", "Gall", 3, "Tak");
        student.showInfo();
    }
}
