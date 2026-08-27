package com.pes.lib

interface CreditInterface {
    fun credit(amount: Int): Boolean
}

interface DebitInterface {
    val debitLimit: Int
    fun debit(amount: Int): Boolean
}

open class Bankaccount(
    val accName: String,
    val accNum: Int
) {

    var balance = 0

    fun showBalance() {
        println("Account Name: $accName")
        println("Account Number: $accNum")
        println("Balance: $balance")
    }
}

class savingAccount(
    accName: String,
    accNum: Int
) : Bankaccount(accName, accNum), CreditInterface, DebitInterface {

    override val debitLimit: Int = 100000

    override fun credit(amount: Int): Boolean {
        if (amount > 0) {
            balance += amount
            return true
        }
        return false
    }

    override fun debit(amount: Int): Boolean {
        if (amount > 0 && amount <= debitLimit && amount <= balance) {
            balance -= amount
            return true
        }
        return false
    }
}

fun main() {

    val account = savingAccount(
        accName = "Sahasra",
        accNum = 12345
    )

    println("Initial Account Details:")
    account.showBalance()

    println("\nCredit 50000:")
    if (account.credit(50000)) {
        println("Credit successful")
    } else {
        println("Credit failed")
    }
    account.showBalance()

    println("\nDebit 10000:")
    if (account.debit(10000)) {
        println("Debit successful")
    } else {
        println("Debit failed")
    }
    account.showBalance()

    println("\nDebit 100000:")
    if (account.debit(100000)) {
        println("Debit successful")
    } else {
        println("Debit failed")
    }
    account.showBalance()
}