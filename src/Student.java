public class Student extends Thread {
    private University university;
    private int NIP;

    public Student(University university) {
        this.university = university;
    }

    public void run() {
        try {
            NIP = university.enroll(this);
            //System.out.println("Número de estudiante NIP :  " + this.getId() +  NIP);
            System.out.println("Número de estudiante NIP :  " + NIP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
