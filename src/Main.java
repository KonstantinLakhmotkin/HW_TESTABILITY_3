public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 0.0999 / 12;                   // месячная процентная ставка
        double credit = 1_000_000;                      // сумма кредита
        int period;                                     // срок кредита в месяцах


        System.out.println();
        System.out.println((int) service.calculate(percent, credit, 12));

        System.out.println();
        System.out.println((int) service.calculate(percent, credit, 24));

        System.out.println();
        System.out.println((int) service.calculate(percent, credit, 36));

    }
}
