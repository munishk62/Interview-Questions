package factory.pattern;

public class FactoryPatternMainClass {
    public static void main(String[] args) {
//        ProfessionAbstractFactory professionFactory = new ProfessionAbstractFactory();
//        Profession doc = professionFactory.getProfession("Doctor");
//        doc.print();

       AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
       Profession engg = abstractFactory.getProfession("Engineer");
       engg.print();
    }
}
