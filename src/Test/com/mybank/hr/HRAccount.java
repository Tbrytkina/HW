package Test.com.mybank.hr;

import Test.com.mybank.account.Account;
import Test.com.mybank.newhr.NewHRAccount;

public class HRAccount extends Account {
    public static void main(String[] args) {

        Account simpleAccount = new Account();
    //    simpleAccount.accountId; - мы не можем получить доступ к полю protected через объект родительского класса
    // созданный в классе-наследнике даже не смотря на extends Account

        HRAccount hrAccount = new HRAccount();
        System.out.println(hrAccount.accountId); // через объект класса HRAccount, который расширяет класс Account
        // мы вполне легко можем получить доступ к полю accountId, который помечен как protected

        NewHRAccount newHRAccount = new NewHRAccount();
        System.out.println(newHRAccount.accountId);

        //newHRAccount.name = не получится
    }
}
