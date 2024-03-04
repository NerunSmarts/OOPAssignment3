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
    
    public student getStudent() {
        return student;
    }

    public UUID getUUID() {
        return uuid;
    }

    public scheduleObject[] getScheduleObjects() {
        return scheduleObjects;
    }

    public void addScheduleObject(scheduleObject scheduleObject) {
        if (scheduleObjects.length < 50) {
        scheduleObjects[scheduleObjects.length] = scheduleObject;
        } else {
            throw new IllegalArgumentException("A schedule cannot have more than 50 schedule objects");
        }
    }

    public void removeScheduleObject(scheduleObject scheduleObject) {
        for (int i = 0; i < scheduleObjects.length; i++) {
            if (scheduleObjects[i] == scheduleObject) {
                scheduleObjects[i] = null;
            }
        }
    }

}
