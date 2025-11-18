import org.example.model.entity.MemberEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(MemberEntity.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();   // REQUIRED

        session.persist(memberEntity);  // INSERT

        session.getTransaction().commit();   // REQUIRED
        session.close();
        sessionFactory.close();
    }
}
