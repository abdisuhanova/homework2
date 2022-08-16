public class Main {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Programmer coder = new Programmer();
        Dancer dancer = new Dancer();
        Person[] people = {(Person) singer, (Person) dancer, (Person) coder};
        for (Person p:people){
            p.walk();
        }
    }
}