package homework_6.hospital;

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Лечит хирург");
    }
}
