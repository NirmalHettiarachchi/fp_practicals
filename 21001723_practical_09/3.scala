class Account(accountNumber: String) {

    var balance = 0
  
    def deposit(amount: Int) = {
        if (amount > 0) {
            balance = balance + amount
        } else {
            println("Invalid deposit amount!")
        }
    }

    def withdraw(amount: Int) = {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount
        } else {
            println("Invalid withdrawal amount!")
        }
    }

    def transfer(amount: Int, transferAccount: Account) = {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount
            transferAccount.balance = transferAccount.balance + amount
        } else {
            println("Invalid transfer amount!")
        }
    }
}

object Main extends App {
    val account1 = new Account("1234")
    val account2 = new Account("5678")

    println("Initial balances:")
    println("Account 1 balance: "  + account1.balance)
    println("Account 2 balance: " + account2.balance)

    account1.deposit(200)
    account1.withdraw(50)
    account1.transfer(150, account2)

    println("Updated balances:")
    println("Account 1 balance: "  + account1.balance)
    println("Account 2 balance: " + account2.balance)
}