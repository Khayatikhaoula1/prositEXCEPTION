package ExceptionPersonalise;

public class Personne {

    private int age;


    public void setAge(int age) throws AgeNegatifException{
       if(age>0)
        this.age = age;
       else throw new AgeNegatifException("Age négatif");
    }

    public int getAge() {
        return age;
    }
}
