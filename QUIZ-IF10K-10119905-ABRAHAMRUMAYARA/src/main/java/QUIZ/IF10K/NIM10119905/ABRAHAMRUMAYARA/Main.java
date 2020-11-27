/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ.IF10K.NIM10119905.ABRAHAMRUMAYARA;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA : ABRAHAM
 * NIM : 10119905
 * KELAS : IF10K
 * DESKRIPSI : QUIZ PBO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        Customer objCustomer = new Customer();
        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.println("Customer name : ");
        objCustomer.setName(scanner.nextLine());
        
        System.out.println("Customer Email : ");
        objCustomer.setEmail(scanner.nextLine());
        
        objCustomer.displayService();
        var pilihanUser = scanner.nextInt();
               
        
        System.out.println("Are You member (Yes/No) = ");
        objCustomer.setMember(objCustomer.checkMemberStatus(scanner.next()));
        
        objCustomer.setPriceService(pilihanUser);
        
        
        System.out.println("**************************");
        System.out.println("***CUSTOMER INVOICE*******" );
        System.out.println("Date Transaction : "+ objCustomer.currentTime());
        System.out.println("Service Price : "+ objCustomer.getPriceService() );
        System.out.println("Discount : "+ objCustomer.getSale(objCustomer.isMember(),objCustomer.getPriceService()));
        System.out.println("Total Pay : "+objCustomer.getTotalPay(objCustomer.getPriceService(), objCustomer.getSale(objCustomer.isMember(),objCustomer.getPriceService())));
        
        
        
        
        
    }
    
}
