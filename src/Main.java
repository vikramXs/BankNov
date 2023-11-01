public class Main {
    public static void main(String[] args) {

        V account1 = new V("holder1","abc123",25000);

        System.out.println(account1);

//        //fetchBalance
//        System.out.println(account1.fetchBalance("abcd123"));
//        System.out.println(account1.fetchBalance("abc123"));
//
//        //addMoney
//        System.out.println(account1.addMoney(25000));
//        System.out.println(account1.addMoney(-25000));

//        //withdrawMoney
//        System.out.println(account1.withdrawMoney("abcd123" , 49000));
//        System.out.println(account1.withdrawMoney("abc123",51000));
//        System.out.println(account1.withdrawMoney("kaka",56312));
//        System.out.println(account1.withdrawMoney("abc123",14000));
//
        //changePassword
        System.out.println(account1.changePassword("hab","jan"));
        System.out.println(account1.changePassword("abc123","abc1234"));


        //calculate ROI
        System.out.println(account1.rateOfInterest(5));
    }
}