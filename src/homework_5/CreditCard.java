package homework_5;

public class CreditCard {
    long CardNumber;
    int CardBalance;

    public CreditCard(long CreditNumber, int CardBalance) {
        this.CardNumber = CreditNumber;
        this.CardBalance = CardBalance;
    }

    public void addMoney(int Money) {
        CardBalance += Money;
    }

    public void withdrawMoney(int Money) {
        CardBalance -= Money;
    }

    public void balance() {
        System.out.println("Баланс на счету карты №  " + CardNumber + " = " + CardBalance);
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard(1, 1000);
        CreditCard card2 = new CreditCard(2, 1000);
        CreditCard card3 = new CreditCard(3, 1000);
        card.addMoney(100);
        card2.addMoney(24500);
        card3.withdrawMoney(340);
        card.balance();
        card2.balance();
        card3.balance();
    }
}
