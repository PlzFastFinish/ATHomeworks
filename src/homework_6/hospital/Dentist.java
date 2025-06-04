package homework_6.hospital;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечит дантист");
    }
}