package core.module04.homework;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) {
            return 100;
        } else if (this.getCurrency() == Currency.EUR) {
            return 150;
        } else {
            return -1;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.USD) {
            return 10000;
        } else if (this.getCurrency() == Currency.EUR) {
            return 5000;
        } else {
            return -1;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) {
            return 1;
        } else if (this.getCurrency() == Currency.EUR) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                return 3;
            } else {
                return 5;
            }
        } else if (this.getCurrency() == Currency.EUR) {
            if (summ <= 1000) {
                return 10;
            } else {
                return 11;
            }
        } else {
            return -1;
        }
    }

}
