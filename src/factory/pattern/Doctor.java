package factory.pattern;

public class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("In print of Doctor class");
    }
}
