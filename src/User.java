public class User {
    // Аль Маджали Ахмад, второй месяц андроида, группа с 4 по 6, домашнее задание 3 урока
    public static void main(String[] args) {
        Account ahmadMajali  = new Account();
        ahmadMajali.deposit(20000.00);
        while (true){
           try {
               ahmadMajali.withDraw(6000.0);

           }  catch (AmountException b ){
               try {

                   ahmadMajali.withDraw((Double) b.getRemainingAmout());

                   } catch (AmountException ex){
                   ex.getRemainingAmout();

               }
               break;
           }

        }




    }
}
