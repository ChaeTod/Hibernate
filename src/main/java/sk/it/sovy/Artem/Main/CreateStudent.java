package sk.it.sovy.Artem.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.sovy.Artem.enty.StudentEntity;
import sk.it.sovy.Artem.enty.SubjectDebtsEntity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

public class CreateStudent {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        java.util.Date now = calendar.getTime();

        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);

        //java.sql.Date = now.getTime();

        java.sql.Timestamp currentTime = new java.sql.Timestamp(now.getTime());

        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentEntity.class).addAnnotatedClass(SubjectDebtsEntity.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // create the objects
            // StudentEntity student_1 = new StudentEntity("Tom", "Marty", "23 Groove St.", currentTime, "66448315", "11.09.12", "IT", 3, 933);
            // StudentEntity student_2 = new StudentEntity("Nick", "Chuckles", "11th Panama-Ave", currentTime,15646413, date, "IT", "Second", 921);
            StudentEntity student_1 = new StudentEntity("Roman", "Ribben", "NYC.", currentTime, +385216413, date, "Commercial Logistic", "Second", 921);

            SubjectDebtsEntity subjectDebtsEntity = new SubjectDebtsEntity("Programming", 2, "+", 2);

            // associate the objects
            student_1.setSubjectDebtsBySubjectId(subjectDebtsEntity);

            subjectDebtsEntity.add(student_1);
            //subjectDebtsEntity.add(student_2);

            // start a transaction
            session.beginTransaction();

            // save the instructor
            // this will ALSO save the details object because of CascadeType.ALL
            System.out.println("Saving student: " + student_1);
            session.save(student_1);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
