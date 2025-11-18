import org.example.model.entity.MemberEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        MemberEntity memberEntity = new MemberEntity(
                1L,
                "Sarasi",
                20,
                "Panadura",
                "prarthanasarasi276@gmail.com",
                "0774955437"
        );

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(org.example.model.entity.MemberEntity.class);
        configuration.configure("hibernate.cfg.xml");

        SessionFactory factory = configuration.buildSessionFactory();

        //add student
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

//       //save student
//       session.persist(student);

//        //search student
//        System.out.println(session.find(Student.class,101));
//
//        //delete student
//        session.remove(session.find(Student.class, 101));

        //update student
        session.merge(memberEntity);

        transaction.commit();
    }
}
