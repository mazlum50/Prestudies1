package persons;

public class StudentTest {
    public static void main(String[] args) {
        Student max = new Student(
                "I like numbers in Java - aren't they int-eresting?!");
                max.setName("Max");
                max.setAge(17);
                max.setAddress("Wall street 22");
        max.introduce();
        // This method is only available in Student and not Person max.tellJoke();
    }
}
