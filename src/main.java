import java.util.UUID;
public class main {
    public static void main(String[] args) {
        student student1 = new student("John", "Doe", UUID.randomUUID());
        System.out.println(student1.getUUID()); //okay so UUID generation does work
        
    }
}
