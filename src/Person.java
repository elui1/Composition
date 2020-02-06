import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;

    public Person() {
        this.job = new Job();
        job.setSalary(1000L);

        this.education = new Education();
//        ArrayList<String> schools = new ArrayList<>();
//        schools.add("test");
//        education.setSchools(schools);
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

//    public ArrayList<String> getEducation() {
//        return education.getSchools();
//    }
//
//    public void setEducation(Education education) {
//        this.education = education;
//    }

    public long getSalary() {
        return job.getSalary();
    }

    public String toString() {
        return job.toString() + "\n" + education.toString();
    }
}

