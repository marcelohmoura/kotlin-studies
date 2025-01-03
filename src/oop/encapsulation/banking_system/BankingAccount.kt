package oop.encapsulation.banking_system

/**
 * Represents a simple banking account, with account number and Balance.
 * The class implementation try to satisfy the immutability principle, ever returning a new object changed,
 * instead of change the attributes directly.
 */

class BankingAccount(private val accountNumber: String, private val accountBalance: Double = 0.00) {

    fun getBalance(): Double = accountBalance

    fun deposit(depositValue: Double) = BankingAccount(accountNumber, accountBalance + depositValue)

    fun withdrawal(withdrawalValue: Double) = BankingAccount(accountNumber, accountBalance - withdrawalValue)

}
