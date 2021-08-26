package kr.or.shi.customer;

public class CustomerTest {

    public static void main(String[] args){
        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerID(10010);
        int price = customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo() + " " + price);

        VIPCustomer vipCustomerKim = new VIPCustomer(10020, "김유신");
//        vipCustomerKim.setCustomerName("이유신");
//        vipCustomerKim.setCustomerID(10011);
        vipCustomerKim.bonusPoint = 1000;
        price = vipCustomerKim.calcPrice(1000);

        System.out.println(vipCustomerKim.showCustomerInfo() + " " + price);

        Customer vc = new VIPCustomer(10030, "sct");      //vc가 upcasting됨.
        price = vc.calcPrice(1000);                              //overriding된 메서드가 호출됨.
        System.out.println(vc.showCustomerInfo() + " " + price);

    }
}
