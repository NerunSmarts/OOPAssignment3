import java.util.UUID;
public class schedule {
    private student student;
    private UUID uuid;
    private UUID studentUUID = student.getUUID();
    private scheduleObject[] scheduleObjects;

    public schedule(student student, UUID uuid, scheduleObject[] scheduleObjects) {
        this.student = student;
        this.uuid = uuid;
        this.scheduleObjects = scheduleObjects;
    }
    

}
