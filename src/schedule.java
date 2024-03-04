import java.util.UUID;
public class schedule {
    private student student;
    private UUID uuid;
    private scheduleObject[] scheduleObjects;

    public schedule(student student, UUID uuid, scheduleObject[] scheduleObjects) {
        this.student = student;
        this.uuid = uuid;
        this.scheduleObjects = scheduleObjects;
    }
    

}
