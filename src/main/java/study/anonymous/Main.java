package study.anonymous;

public class Main {

    public static void main(String[] args) {

        // 익명 클래스
        Car sonata = new Car() {
            @Override
            public void run() {
                System.out.println("소나타가 달립니다.");
            }
        };

        Driver driver = new Driver();
        driver.drive(sonata);

        driver.drive(new Car() {
            @Override
            public void run() {
                System.out.println("페라리가 달립니다.");
            }
        });

        // 람다식(Functional Interface)
        // 조건: 인터페이스에 추상메서드가 단 하나여야 함.
        // (a, b) -> { return a + b};
        // (a, b) -> a + b;
        Car morning = () -> System.out.println("모닝이 달립니다.");

        morning.run();

        driver.drive(()-> System.out.println("그랜져가 달립니다."));


        /////////////////////////////////////////////////////////////
        System.out.println("=================================================");

        Calculator addOper = (a, b) -> a + b;
        Calculator multiOper = (a, b) -> a * b;

        System.out.println(addOper.operate(10,20));
        System.out.println(multiOper.operate(30, 3));


    }

}
