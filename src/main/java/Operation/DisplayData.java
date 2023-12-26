package Operation;

import Connection.SessionFactoryHelper;
import Model.ContactNo;
import Model.WhatsAppInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;



public class DisplayData {
    private static Scanner sc =new Scanner(System.in);
    public void displayContactData(){

        SessionFactory sessionFactory= SessionFactoryHelper.getSessionFactory();
        Session session= sessionFactory.openSession();

        System.out.println("Enter the Id,Whose data you want");
        int id= sc.nextInt();
        ContactNo p1=session.load(ContactNo.class,id);

        System.out.println("Contact Name-> "+p1.getContactName());
        System.out.println("Contact Number-> "+p1.getContactNumber());
        System.out.println("Service Provider-> "+p1.getServiceProvider());
        System.out.println("5G Enable or Not-> "+p1.isFiveGEnableORNot());
        System.out.println("-----------------------------------------------");


        session.close();
    }

    public void displayWhatsAppData(){

        SessionFactory sessionFactory= SessionFactoryHelper.getSessionFactory();
        Session session= sessionFactory.openSession();

        System.out.println("Enter the Id,Whose data you want");
        int id1= sc.nextInt();
        WhatsAppInfo w1 =session.load(WhatsAppInfo.class,id1);

        System.out.println("WhatsApp Name-> "+w1.getWhatsappName());
        System.out.println("WhatsApp About-> "+w1.getAbout());
        System.out.println("WhatsApp Number-> "+w1.getWhatsappNumber());
        System.out.println("WhatsApp Type-> "+w1.getAccountType());
        System.out.println("-----------------------------------------------");

        session.close();

    }
}
