package com.example.bankaccountprogram

import android.accounts.Account

fun main (){

    val lkBankAccount = BankAccount (accountHolder = "L K", balance = 1234.123)

    lkBankAccount.deposit(amount = 200.0)
    //lkBankAccount.displayTransactionHistory()
    lkBankAccount.withdraw(amount = 1200.00)
    lkBankAccount.deposit(amount = 3000.12)
    lkBankAccount.deposit(amount = 10245.33)
    lkBankAccount.withdraw(amount = 3333.33)

    //lkBankAccount.displayTransactionHistory()

    println("${lkBankAccount.accBalance()}")

    val sarahbankAccount = BankAccount (accountHolder = "Sarah", balance = 0.0)

    sarahbankAccount.deposit(amount = 100.0)
    sarahbankAccount.withdraw(amount = 10.0)
    sarahbankAccount.deposit(amount = 300.0)

    sarahbankAccount.displayTransactionHistory()

    println("${sarahbankAccount.accBalance()}")


}