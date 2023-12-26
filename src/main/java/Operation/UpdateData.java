package Operation;

import Connection.SessionFactoryHelper;
import Model.ContactNo;
import Model.WhatsAppInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

public class UpdateData {

    private static Scanner sc =new Scanner(System.in);
    static SessionFactory sessionFactory = SessionFactoryHelper.getSessionFactory();
    static Session session = sessionFactory.openSession();
    public void updateContactData() {



        System.out.println("Enter The Contact ID-> ");
        int id= sc.nextInt();
        ContactNo p1 = session.load(ContactNo.class, id);

        boolean stutes=true;
        while (stutes){
            System.out.println("Update The Contact Data");
            System.out.println("-----------------------");
            System.out.println("| 1. Update Name    |");
            System.out.println("| 2. Update Number|");
            System.out.println("| 3. Service Provider |");
            System.out.println("| 4. 5G States  |");
            System.out.println("| 5. WhatsApp Name |");
            System.out.println("| 6. WhatsApp Number |");
            System.out.println("| 7. WhatsApp About |");
            System.out.println("| 8. Main Menu |");
            System.out.println("-------------------");
            System.out.println("ENTER THE OPERATION");

            int choice= sc.nextInt();

            switch (choice){

                case 1:
                    updateName(p1);
                    break;
                case 2:
                    updateNumber(p1);
                    break;
                case 3:
                    serviceProvider(p1);
                break;
                case 4:
                    fiveGStutes(p1);
                    break;
                case 5:
                    WhatsAppName(p1);
                    break;
                case 6:
                    WhatsAppNumber(p1);
                    break;
                case 7:
                    WhatsAppAbout(p1);
                    break;
                case 8:
                    System.out.println("Thank You");
                    stutes=false;
                    session.close();

                    break;
            }

        }
        session.close();
    }
    private void updateNumber(ContactNo p1){
        System.out.println("Enter New Contact Number-> ");
        long number= sc.nextLong();
        Transaction tx = session.beginTransaction();
        p1.setContactNumber(number);
        tx.commit();
        session.update(p1);

    }

    private void updateName(ContactNo p1){
        System.out.println("Enter New Contact Name ->");
        sc.nextLine();
        String name = sc.nextLine();
        Transaction tx = session.beginTransaction();
        p1.setContactName(name);
        tx.commit();
        session.update(p1);
    }

    private void serviceProvider(ContactNo p1){
        System.out.println("Enter New Service Provider ->");
        sc.nextLine();
        String sp = sc.nextLine();
        Transaction tx = session.beginTransaction();
        p1.setServiceProvider(sp);
        tx.commit();
        session.update(p1);
    }

    private void fiveGStutes(ContactNo p1){
        System.out.println("Enter New 5G States ->");
        boolean fiveG = sc.nextBoolean();
        Transaction tx = session.beginTransaction();
        p1.setFiveGEnableORNot(fiveG);
        tx.commit();
        session.update(p1);
    }

    private void WhatsAppName(ContactNo p1){
        System.out.println("Enter New WhatsApp Name ->");
        sc.nextLine();
        String name = sc.nextLine();
        Transaction tx = session.beginTransaction();
        p1.getWhatsAppAccountRef().setWhatsappName(name);
        tx.commit();
        session.update(p1);
    }

    private void WhatsAppNumber(ContactNo p1){
        System.out.println("Enter New Service Provider ->");
        sc.nextLine();
        long wNumber = sc.nextLong();
        Transaction tx = session.beginTransaction();
        p1.getWhatsAppAccountRef().setWhatsappNumber(wNumber);
        tx.commit();
        session.update(p1);
    }

    private void WhatsAppAbout(ContactNo p1){
        System.out.println("Enter New Service Provider ->");
        sc.nextLine();
        String about = sc.nextLine();
        Transaction tx = session.beginTransaction();
        p1.getWhatsAppAccountRef().setAbout(about);
        tx.commit();
        session.update(p1);
    }

}
