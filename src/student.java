import java.util.UUID;
public class student {

    private String firstName;
    private String lastName;
    private UUID uuid;
    private schedule[] schedules;

    public student(String firstName, String lastName, UUID uuid, schedule[] schedules) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = uuid;
        this.schedules = schedules;
    }
    public student(String firstName, String lastName, UUID uuid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = uuid;
    }
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public UUID getUUID() {
            return uuid;
        }

        public void setUUID(UUID uuid) {
            this.uuid = uuid;
        }

        public schedule[] getSchedules() {
            return schedules;
        }

        public void setSchedules(schedule[] schedules) {
            this.schedules = schedules;
        }
    }
    
