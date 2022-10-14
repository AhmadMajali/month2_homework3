public class Account {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public void  deposit(Double som){
        amount += som;
        System.out.println("Вы пополнили счет на:" + som + " " + "som" );

    }

    public void withDraw(Double som) throws AmountException {
        if (amount < som ){
            throw new AmountException("на вашем  счету недостаточно средств", amount);

        }

        else  {
         if (som == 6000.0)
            System.out.println("Вы сняли со счета:" + som + "som");
            amount -= som;
            if (som == 6000.0)
            System.out.println("Остаток на счету:" + amount + "som");


        }
        if (amount == 2000){
            System.out.println("ошибка операции, недостаточно средств на счетy" + " " + amount + "som");
            amount -=2000;
            System.out.println("Вы сняли со счета:" + " " + 2000.0 + " " + "som" + " " + "Остаток на счету:" + amount);
        }
    }
}
