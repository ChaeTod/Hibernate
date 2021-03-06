package sk.it.sovy.Artem.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.sovy.Artem.enty.StudentEntity;
import sk.it.sovy.Artem.enty.SubjectDebtsEntity;

public class GetStudent {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentEntity.class).addAnnotatedClass(SubjectDebtsEntity.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            int temp_id = 5;
            // save the instructor
            // this will ALSO save the details object because of CascadeType.ALL
            System.out.println("Get student's phone number with an id: ");
            StudentEntity studentEntity = session.get(StudentEntity.class, temp_id);
            System.out.println(studentEntity.toString());

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
