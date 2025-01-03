package oop.encapsulation.banking_system

fun main() {
    var bankingAccount = BankingAccount(accountNumber = "0001", accountBalance = 1000.00)

    println("Initial account balance: ${bankingAccount.getBalance()}")

    bankingAccount = bankingAccount.deposit(depositValue = 500.00)

    println("Update balance after deposit: ${bankingAccount.getBalance()}")

    bankingAccount = bankingAccount.withdrawal( withdrawalValue = 100.00)

    println("Update balance after withdrawal: ${bankingAccount.getBalance()}")

}
