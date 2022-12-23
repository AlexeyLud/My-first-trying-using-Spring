import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final Account a = new Account(100);
        final Account b = new Account(2000);
        while(true){
            System.out.println("Введите 0 чтобы выйти или 1 чтобы продолжить:");
            int i = in.nextInt();
            if(i == 0){
                System.out.println("Goodbye");
                System.exit(0);
            }
            System.out.println("Введите сумму перевода:");
            int am = in.nextInt();
            System.out.println("Выберите тип отправки 1) от 1го ко 2му или 2) от 2го к 1му");
            int type = in.nextInt();
            if(type == 1){
                transfer(a, b, am);
            }
            if(type == 2){
                transfer(b, a, am);
            }
        }
    }

    static void transfer(Account ac1, Account ac2, int amount){
        Scanner in = new Scanner(System.in);
        if(ac1.getBalance() < amount) {
            System.out.println("На балансе недостаточно денег");
            System.out.println("У вас на балансе = " + ac1.getBalance());
            System.out.println("А сумма перевода = " + amount);
            System.out.println("Пополнить баланс?(input y/n)");
            String s = in.nextLine();
            if(s.equals("y")){
                System.out.println("Введите сумму для пополнения(до 4000):");
                int summ = in.nextInt();
                ac1.addBalance(summ);
                System.out.println("Теперь на вашем балансе = " + ac1.getBalance());
            }
            else if(s.equals("n")){
                System.out.println("Goodbye");
                System.exit(0);
            }
        }
        ac1.withdraw(amount);
        ac2.deposit(amount);
        System.out.println("Передача произошла успешно!");
        System.out.println("Баланс первого аккаунта = " + ac1.getBalance());
        System.out.println("Баланс второго аккаунта = " + ac2.getBalance());
    }

}
