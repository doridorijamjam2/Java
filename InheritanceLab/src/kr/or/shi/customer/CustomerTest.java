package kr.or.shi.customer;

public class CustomerTest {

    public static void main(String[] args){
/*        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());*/

        VIPCustomer vipcustomerKim = new VIPCustomer(10020, "김유신");
        vipcustomerKim.setCustomerName("이유신");
        vipcustomerKim.setCustomerID(10011);
        vipcustomerKim.bonusPoint = 1000;
        System.out.println(vipcustomerKim.showCustomerInfo());
    }
}
