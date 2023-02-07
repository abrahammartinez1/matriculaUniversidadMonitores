public class Main {
    public static void main(String[] args) {

        int numPuestos = 2;
        int numEstudiantes = 2;

        University university = new University(numPuestos);
        for (int i = 1; i <= numEstudiantes; i++) {
            new Student(university).start();
        }
    }
}
