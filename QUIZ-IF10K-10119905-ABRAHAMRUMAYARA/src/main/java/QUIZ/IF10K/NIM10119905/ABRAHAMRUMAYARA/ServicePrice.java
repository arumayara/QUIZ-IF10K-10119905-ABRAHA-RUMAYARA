/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ.IF10K.NIM10119905.ABRAHAMRUMAYARA;

/**
 *
 * @author aruma
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    @Override
    public void displayService(){
        System.out.println("*************************");
        System.out.println("***Rock n Roll Haircut***");
        System.out.println("*******Service List******");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash : IDR 55K");
        System.out.println("3. Haircut Only : IDR 15K");
        System.out.println("*************************");
        System.out.println("Choose (1/2/3)");
    }
    
    @Override
    public float getPrice(int serviceItem){
        switch (serviceItem) {
            case 1 : this.priceService = 45000;
            case 2 : this.priceService = 55000;
            case 3 : this.priceService = 15000;
            default : this.priceService = 0;
        };
        return priceService;
    }
    
    @Override
    public boolean checkMemberStatus(String statusMember){
        return statusMember.equals("yes");
        
    }
    
    @Override
    public float getSale( boolean isMember, float parServicePrice){
        if (isMember)
            return parServicePrice * 0.1f;
        
        return parServicePrice;
    }
    public float getTotalPay(float priceService, float discount){
        return priceService-discount ;
    }
    
    
    
    
}
