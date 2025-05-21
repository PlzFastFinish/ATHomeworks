package homework_5;

public class Atm {
    int twenty;
    int fifty;
    int hundred;

    public void addTwenty(int twenty) {
        this.twenty += twenty;
    }

    public void addFifty(int fifty) {
        this.fifty += fifty;
    }

    public void addHundred(int hundred) {
        this.hundred += hundred;
    }

    public void withdraw_money(int Sum) {
        int cntT = 0;
        int cntF = 0;
        int cntO = 0;
        if (Sum > twenty * 20 + fifty * 50 + hundred * 100) {
            System.out.println("Недостаточно средств");
        } else {
            while (Sum >= 100 && hundred >= 1) {
                cntO += 1;
                Sum -= 100;
                hundred = hundred - 1;
            }
            while (Sum >= 50 && fifty >= 1) {
                cntF += 1;
                Sum -= 50;
                fifty = fifty - 1;
            }
            while (Sum >= 20 && twenty >= 1) {
                cntT += 1;
                Sum -= 20;
                twenty = twenty - 1;
            }
            if (Sum != 0) {
                System.out.println("Операция не произойдет, не удается выдать остаток " + Sum);
            } else {
                System.out.println("К выдаче " + cntO + " Купюр по 100");
                System.out.println(cntF + " Купюр по 50");
                System.out.println(cntT + " Купюр по 20");
            }
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.addFifty(20);
        atm.addHundred(15);
        atm.addTwenty(4);
        atm.withdraw_money(100);
        System.out.println();
        atm.withdraw_money(470);
        System.out.println();
        atm.withdraw_money(2020);
        System.out.println();
        atm.withdraw_money(211);
    }
}
