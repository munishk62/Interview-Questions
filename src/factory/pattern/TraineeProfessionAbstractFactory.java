package factory.pattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory {
    public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null) {
            return null;
        }
        if(typeOfProfession.equalsIgnoreCase("Doctor")) {
            return new TraineeDoctor();
        }
        if(typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraineeTeacher();
        }
        if(typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new TraineeEngineer();
        }
        return null;
    }
}
