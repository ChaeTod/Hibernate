package sk.it.sovy.Artem.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.sovy.Artem.enty.StudentEntity;
import sk.it.sovy.Artem.enty.SubjectDebtsEntity;

public class DeleteDebt {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentEntity.class).addAnnotatedClass(SubjectDebtsEntity.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            int temp_id = 6;
            // save the instructor
            // this will ALSO save the details object because of CascadeType.ALL
            System.out.println("Deleting the student's debt with picked id");
            SubjectDebtsEntity subjectDebtsEntity = session.get(SubjectDebtsEntity.class, temp_id);
            session.delete(subjectDebtsEntity);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
