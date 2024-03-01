package factory.pattern;

public class ProfessionAbstractFactory extends AbstractFactory {
    public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null) {
            return null;
        }
        if(typeOfProfession.equalsIgnoreCase("Doctor")) {
            return new Doctor();
        }
        if(typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }
        if(typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Doctor();
        }
        return null;
    }
}
