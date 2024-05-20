public class CreditPaymentService {

    public double calculate(double percent, double credit, int period) {

        double coefficient = Math.pow((1 + percent), period);
        double payment = credit * ((percent * coefficient) / (coefficient - 1));
        return payment;
    }
}

