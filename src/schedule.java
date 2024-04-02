import java.util.UUID;

public class Schedule {
    private static final int MAX_SCHEDULE_ENTRY = 50;
    private ScheduleEntry[] scheduleEntries = new ScheduleEntry[MAX_SCHEDULE_ENTRY];
    private int scheduleEntryIndex;
    private int studentId;
    private UUID uuid;

    public Schedule(int studentId){
        this.studentId = studentId;
        this.uuid = UUID.randomUUID();
    }
    public Schedule(Schedule otherSchedule){
        this.studentId = otherSchedule.studentId;
        this.scheduleEntryIndex = otherSchedule.scheduleEntryIndex;
        this.scheduleEntries = otherSchedule.scheduleEntries;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {return uuid;}
    public int getStudentId() {return studentId;}
    public ScheduleEntry getScheduleEntryIndex(int index) {return scheduleEntries[index];}
    public boolean addScheduleEntry(ScheduleEntry scheduleEntry) {
        boolean contains = false;
        for (ScheduleEntry c : scheduleEntries) {
            if (scheduleEntry == c) {
                contains = true;
            }
        }
        if (scheduleEntries.length < MAX_SCHEDULE_ENTRY && !contains) {

            return true;
        }
        else{
            return false;
        }
    }
}