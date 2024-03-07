import java.util.UUID;
public class schedule {
    private student student; // the student object associated with this schedule`
    private UUID uuid; // the UUID of this schedule
    private UUID studentUUID = student.getUUID(); // the UUID of the student associated with this schedule
    private scheduleObject[] scheduleObjects; // an array of schedule objects associated with this schedule

    public schedule(student student, UUID uuid, scheduleObject[] scheduleObjects) {
        this.student = student;
        this.uuid = uuid;
        this.scheduleObjects = scheduleObjects;
    }
    
     /**
     * Returns the student associated with this schedule.
     *
     * @return The student associated with this schedule.
     */

    public student getStudent() {
        return student;
    }

     /**
     * Returns the UUID of this schedule.
     *
     * @return The UUID of this schedule.
     */

    public UUID getUUID() {
        return uuid;
    }

     /**
     * Returns an array of schedule objects associated with this schedule.
     *
     * @return An array of schedule objects.
     */

    public scheduleObject[] getScheduleObjects() {
        return scheduleObjects;
    }

     /**
     * Adds a schedule object to this schedule. If the schedule already contains 50 objects,
     * an IllegalArgumentException is thrown.
     *
     * @param scheduleObject The schedule object to add.
     * @throws IllegalArgumentException If the schedule already contains 50 objects.
     */

    public void addScheduleObject(scheduleObject scheduleObject) {
        /*
        if (scheduleObjects.length < 50) {
        scheduleObjects[scheduleObjects.length] = scheduleObject;
        } else {
            throw new IllegalArgumentException("A schedule cannot have more than 50 schedule objects");
        }
        */
    }

    /**
     * Removes a schedule object from this schedule. If the object is not found, no action is taken.
     *
     * @param scheduleObject The schedule object to remove.
     */

    public void removeScheduleObject(scheduleObject scheduleObject) {
        /*
        for (int i = 0; i < scheduleObjects.length; i++) {
            if (scheduleObjects[i] == scheduleObject) {
                scheduleObjects[i] = null;
            }
        }
        */
    }

}
