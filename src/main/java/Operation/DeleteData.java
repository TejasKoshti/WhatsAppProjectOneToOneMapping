package Operation;


import Connection.SessionFactoryHelper;
import Model.ContactNo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

public class DeleteData {

    private static Scanner sc =new Scanner(System.in);

    public void deleteData(){


        SessionFactory factory=SessionFactoryHelper.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();


        System.out.println("Enter The Contact ID-> ");
        int id= sc.nextInt();
        ContactNo p1 = session.load(ContactNo.class, id);

        p1.setContactNumber(id);

        session.delete(p1);
        System.out.println("Information Deleted Successfully :)");
        System.out.println("-----------------------------------------");
        tx.commit();
        session.close();

    }
}
