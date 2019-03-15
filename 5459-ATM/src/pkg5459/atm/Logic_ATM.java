package pkg5459.atm;

import java.util.HashMap;

public class Logic_ATM {

    private double balance = 200.0;
    HashMap usersDictionary;
    String arrhistory[] = new String[5];
    int i = 0, m = 0;
    int n, h;

    public Logic_ATM() {
        usersDictionary = new HashMap();
        usersDictionary.put("1111222233334444", "1234");

    }

    public boolean validate(String creditNo, String pin) {
        String fetchedPassword = (String) usersDictionary.get(creditNo);

        boolean validation_Pass;
        if (fetchedPassword != null) {
            validation_Pass = fetchedPassword.equals(pin);
            return validation_Pass;
        }
        return false;
    }

    public double credit(double amount) {

        return balance += amount;
    }

    public double withdrawal(double amount) {

        return balance -= amount;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transactionsHistory(String value) {

        if (i <= 4) {
            arrhistory[i] = value;
            n = i;
            h = i;
            i++;
        } else {

            while (m < 4) {
                arrhistory[m] = arrhistory[m + 1];
                m++;
            }
            arrhistory[m] = value;
            i--;
            n = i;

        }
    }

    public String previous() {

        if (n > 0 && n <= h) {
            return arrhistory[--n];
        } else {
            return arrhistory[n];
        }
    }

    public String next() {

        if (n >= 0 && n < h) {
            return arrhistory[++n];
        } else {
            return arrhistory[n];
        }
    }
}
