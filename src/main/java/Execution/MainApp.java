package Execution;

import Operation.DeleteData;
import Operation.DisplayData;
import Operation.InsertData;
import Operation.UpdateData;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        operation();

    }

    public static void operation(){
        boolean statues=true;
        Scanner sc=new Scanner(System.in);

        while (statues){
            System.out.println("WELCOME USER");
            System.out.println("-------------------");
            System.out.println("| 1. Add Data    |");
            System.out.println("| 2. Display Data|");
            System.out.println("| 3. Update Data |");
            System.out.println("| 4. Delete Data |");
            System.out.println("| 5. Exit App    |");
            System.out.println("-------------------");
            System.out.println("ENTER THE OPERATION");

            int choice=sc.nextInt();


            switch (choice){

                case 1 :
                    InsertData i1=new InsertData();
                    i1.addContactData();
                    break;

                case 2 :
                    DisplayData d1=new DisplayData();
                    boolean status1 = true ;
                    do {

                        System.out.println("Select Display Details");
                        System.out.println("1: Contact Number");
                        System.out.println("2: WhatsApp Data");
                        System.out.println("3: Main Menu");
                        System.out.println("=================================");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                d1.displayContactData();
                                break;

                            case 2:
                                d1.displayWhatsAppData();
                                break;

                            case 3:
                                System.out.println("Thank You !!!");
                                status1=false;
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }
                    }while (status1);
                    break;

                case 3 :
                    UpdateData u1=new UpdateData();
                    u1.updateContactData();
                    break;

                case 4 :
                    DeleteData de1=new DeleteData();
                    de1.deleteData();
                    break;

                case 5 :
                    System.out.println("Thank You for Visiting, Have a Nice Day...!!!");
                    statues=false;
                    break;
            }
        }
    }
}
