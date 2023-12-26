package Operation;

import Connection.SessionFactoryHelper;
import Model.ContactNo;
import Model.WhatsAppInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;


public class InsertData {

    private static Scanner sc=new Scanner(System.in);
    WhatsAppInfo w1=new WhatsAppInfo();
    ContactNo c1=new ContactNo();


    public void addContactData(){

        SessionFactory factory=SessionFactoryHelper.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();

        System.out.printf("Enter The Contact number");
        long contactNumber= sc.nextLong();

        System.out.printf("Enter User Name");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.printf("Enter Service Provider Name");
        String serviceProvider= sc.next();

        System.out.printf("IS 5G Enabled or not (true/false)");
        boolean enabled=sc.nextBoolean();

        System.out.printf("Do You Want to Open Whats App Account (YES / NO)");
        String answer= sc.next();



        if (answer.equalsIgnoreCase("YES")){
            addWhatsAppInformation();
            w1.setWhatsappNumber(contactNumber);
            c1.setWhatsAppAccountRef(w1);
        }

        c1.setContactNumber(contactNumber);
        c1.setContactName(name);
        c1.setServiceProvider(serviceProvider);
        c1.setFiveGEnableORNot(enabled);

        session.save(c1);
        tx.commit();
        System.out.println("Information Saved Successfully :)");
        System.out.println("-----------------------------------------");

    }

    public void addWhatsAppInformation() {


        SessionFactory factory=SessionFactoryHelper.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();

        System.out.println("Enter the WhatsApp Account Name");
        String name = sc.next();

        System.out.println("Enter About -->");
        sc.nextLine();
        String about = sc.nextLine();

        System.out.println("1.Business Account 2. Regular Account");
        int choice = sc.nextInt();

        String accountType = "Regular Account";
        if (choice == 1) {
            accountType = "Regular Account";
        }

        w1.setWhatsappName(name);
        w1.setAbout(about);
        c1.setWhatsAppAccountRef(w1);
        w1.setAccountType(accountType);

        session.save(c1);
        tx.commit();
        System.out.println("-----------------------------------------");
        System.out.println("Thank You Ji:)");
        System.out.println("-----------------------------------------");

    }

}
