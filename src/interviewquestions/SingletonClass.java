package interviewquestions;

public class SingletonClass {
    private static SingletonClass singletonInstance = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getInstance(){
        return singletonInstance;
    }

    public void  simpleMethod() {
        System.out.println("Hashcode of singleton object " + singletonInstance);
    }
}
