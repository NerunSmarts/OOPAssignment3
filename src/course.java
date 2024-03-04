public class course {
      private String courseName;
      private int courseNumber;
      private String program;
      private int credits;
      private course[] prerequisites;

      public course(String courseName, int courseNumber, String program, int credits, course[] prerequisites) {
         this.courseName = courseName;
         this.courseNumber = courseNumber;
         this.program = program;
         this.credits = credits;
         this.prerequisites = prerequisites;
      }
      public String getCourseName() {
         return courseName;
      }

      public void setCourseName(String courseName) {
         this.courseName = courseName;
      }

      public int getCourseNumber() {
         return courseNumber;
      }

      public void setCourseNumber(int courseNumber) {
         this.courseNumber = courseNumber;
      }

      public String getProgram() {
         return program;
      }

      public void setProgram(String program) {
         this.program = program;
      }

      public int getCredits() {
         return credits;
      }

      public void setCredits(int credits) {
         this.credits = credits;
      }

      public course[] getPrerequisites() {
         return prerequisites;
      }

      public void setPrerequisites(course[] prerequisites) {
         
         if (prerequisites.length > 5) {
            throw new IllegalArgumentException("A course cannot have more than 5 prerequisites");
         }
         
         if (prerequisites.length > 0) {
            for (course c : prerequisites) {
               if (c == null) {
                  throw new IllegalArgumentException("A course cannot have a null prerequisite");
               }
               if (c.getCourseNumber() == this.courseNumber) {
                  throw new IllegalArgumentException("A course cannot be a prerequisite for itself");
               }
               for (course c2 : c.getPrerequisites()) {
                  if (c2.getCourseNumber() == this.courseNumber) {
                     throw new IllegalArgumentException("A course cannot be a prerequisite for itself through a chain of prerequisites");
                  }
               }
            }
         }
         this.prerequisites = prerequisites;
      }

   }
