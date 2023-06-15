public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        SecondClass secondObj = new SecondClass();
        int value = secondObj.getSecondValue();
        System.out.println("~~~ " + value + " ~~~");
    }
}