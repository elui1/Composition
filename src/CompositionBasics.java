import java.util.ArrayList;

public class CompositionBasics {
    public static void main(String[] args) {
        Person bobby = new Person();
//        System.out.println(bobby.getSalary());

//        Education edu = new Education();
//        for (String school: edu.getSchools()) {
//            System.out.println(school);
//        }

//        System.out.println(bobby.getSalary());
//        System.out.println(bobby.getEducation());

        Job job = new Job();
        job.setRole("Manager");
        job.setSalary(500);
        job.setId(10);
        bobby.setJob(job);

        // Long way of using setEducation method in Person to change schools info

//        System.out.println(bobby.getJob());
        Education edu = new Education();
//        ArrayList<String> schools = new ArrayList<>();
//        schools.add("boss");
//        edu.setSchools(schools);
//        bobby.setEducation(edu);

        //System.out.println(bobby.toString());
        System.out.println(job);
        System.out.println(edu);
        System.out.println(bobby);

    }
}
