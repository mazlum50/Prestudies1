package persons;

public class Student extends Person{
    private String joke ;
    public Student(String joke){
        this.joke = joke;
    }
    public void telljoke() {
        System.out.println(joke);
    }

    // --------------------- Part 3 --------------------------
    @Override
    public void introduce(){
        super.introduce();
        telljoke();
    }
}
