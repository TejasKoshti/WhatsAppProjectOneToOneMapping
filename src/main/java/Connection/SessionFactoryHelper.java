package Connection;

import Model.ContactNo;
import Model.WhatsAppInfo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {

    public static SessionFactory getSessionFactory(){
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(ContactNo.class);
        cfg.addAnnotatedClass(WhatsAppInfo.class);
        SessionFactory sessionFactory= cfg.buildSessionFactory();
        return sessionFactory;
    }
}
