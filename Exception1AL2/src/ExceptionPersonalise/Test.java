package ExceptionPersonalise;

public class Test {

    public static void main(String[] args) {
        Personne p=new Personne();

        try {
            p.setAge(5);
        } catch (AgeNegatifException e) {
            System.out.println(e);
        }
        System.out.println("Age :"+p.getAge());

        try {
            p.setAge(-2);
        } catch (AgeNegatifException e) {
            System.out.println(e);
        }
        System.out.println("Age :"+p.getAge());
    }
}
