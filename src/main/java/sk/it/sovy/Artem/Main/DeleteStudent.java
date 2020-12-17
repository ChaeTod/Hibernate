package sk.it.sovy.Artem.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.sovy.Artem.enty.StudentEntity;
import sk.it.sovy.Artem.enty.SubjectDebtsEntity;

public class DeleteStudent {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentEntity.class).addAnnotatedClass(SubjectDebtsEntity.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            int temp_id = 10;
            // save the instructor
            // this will ALSO save the details object because of CascadeType.ALL
            System.out.println("Deleting the student with picked id");
            StudentEntity studentEntity = session.get(StudentEntity.class, temp_id);
            session.delete(studentEntity);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
