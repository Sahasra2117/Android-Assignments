package com.pes.lib

open class BankAccount(
    var accName: String,
    val accNumber: Int,
    var balance: Int = 0
) {

    open fun displayInfo() {
        println("Account Holder Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
    }
}

class SavingAccount(
    accName: String,
    accNumber: Int,
    balance: Int = 0,
    var interestRate: Float
) : BankAccount(accName, accNumber, balance) {

    fun credit(amount: Int) {
        balance += amount
    }

    fun debit(amount: Int) {
        balance -= amount
    }

    override fun displayInfo() {
        println("Account Holder Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
        println("Interest Rate: $interestRate")
    }
}

fun main() {

    val account = SavingAccount(
        "Sahasra",
        12345,
        1000,
        5.5f
    )

    println("Initial Account Details:")
    account.displayInfo()

    account.credit(500)

    println("\nAfter Credit:")
    account.displayInfo()

    account.debit(200)

    println("\nAfter Debit:")
    account.displayInfo()
}