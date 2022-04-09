public class Greeter {

    public static void greet(Greeting greeting) {
        greeting.perform();
    }


    public static void main(String[] args) {
//        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
//        greet(helloWorldGreeting);




        MyLambda myHelloLambda = () -> System.out.println("Hello World!");

        MyLambda myHelloInterface=new MyLambda() {

            public void perform() {
                System.out.println("Hello World!");
            }
        };

       myHelloLambda.perform();
       myHelloInterface.perform();

    }
}

interface MyLambda {
    void perform();
}

