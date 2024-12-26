public class TestCohort {
    String companyName;
    int numberOfTrainees;
    String courseName;

    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Number of Trainees: " + numberOfTrainees);
        System.out.println("Course Name: " + courseName);
    }

    public static void main(String[] args) {
        TestCohort cohort1 = new TestCohort();

        cohort1.companyName = "Tech Solutions Inc.";
        cohort1.numberOfTrainees = 25;
        cohort1.courseName = "Software Testing";
        cohort1.displayDetails();
    }
}

