package org.howard.edu.lsp.oopfinal.question2;

// This interface defines a way to pay for something
interface PaymentStrategy {
    void pay(double amount);
}

// This class handles credit card payments
class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber; // The credit card number

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber; // Store the credit card number
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card " + creditCardNumber); // Print payment info
    }
}

// This class handles PayPal payments
class PayPalPayment implements PaymentStrategy {
    private String emailAddress; // The email address for the PayPal account

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress; // Store the email address
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account " + emailAddress); // Print payment info
    }
}

// This class handles the  Bitcoin payments
class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress; // The Bitcoin wallet address

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress; // Store the Bitcoin address
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress); // Print payment info
    }
}

// This class represents a shopping cart
class ShoppingCart {
    private PaymentStrategy paymentStrategy; // The payment method to use

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy; // Set the payment method
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount); // Make the payment
    }
}

// This is the main driver class
public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Try credit card payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        // Try PayPal payment
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50.0);

        // Try Bitcoin payment
        cart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
        cart.checkout(75.0);
    }
}