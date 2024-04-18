package entities;

import exceptions.BusinessExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // para depositar o valor desejado
    public void deposit(double amount) {
        balance += +amount;
    }

    //para sacar o valor desejado
    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new BusinessExceptions("Erro de saque: A quantia excede o limite de saque"); //o String ao lado foi armazenado dentro do objeto da excecao que eh o BusinessException.
        } else if (amount > getBalance()) {
            throw new BusinessExceptions("Erro de saque: Saldo insuficiente");
        }
    }
}
