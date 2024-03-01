package lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system starts....");
//        Approach 1
//        MyInterImpl myInter = new MyInterImpl();
//        myInter.sayHello();


//         Approach 2
//         MyInter i = new MyInter() {
//             @Override
//             public void sayHello() {
//                 System.out.println("This is my first Anonymous class");
//             }
//         };
//         i.sayHello();


        MyInter i1 = () -> {
            System.out.println("This is my first time Im using lambda");
        };

        i1.sayHello();

        MyInter i2 = () -> {
            System.out.println("This is my second time im using lambda");
        };

        i2.sayHello();


    }
}
