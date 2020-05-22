package emailapp;

public class emailMain{
    public static void main(String[] args) {
        Email em1 = new Email("Angelo", "Grant");
        em1.setAlternateEmail("AJ@roboarmy.com");
        System.out.println(em1.showInfo());
    }
}