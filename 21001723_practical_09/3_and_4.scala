class Account(val accountNumber: String, var balance: Double = 0) {
    def deposit(amount: Double) = {
        this.balance = this.balance + amount
    }

    def withdraw(amount: Double) = {
        this.balance = this.balance - amount
    }

    def transfer(amount: Double, transferAccount: Account) = {
        this.balance = this.balance - amount
        transferAccount.balance = transferAccount.balance + amount
    }
}

object Main extends App {
    val account1 = new Account("1234")
    val account2 = new Account("5678")

    account1.deposit(2000)
    account1.withdraw(500)

    println("Balances:")
    println("Account 1: "  + account1.balance)
    println("Account 2: " + account2.balance)

    account1.transfer(1500, account2)

    println("Updated balances:")
    println("Account 1: "  + account1.balance)
    println("Account 2: " + account2.balance)
}

object Q4 extends App {
    val acnts = List(Account("1", 1000), Account("2", -500), Account("3"), Account("4", 2000), Account("5", -1000))

    def getNegativeBalAcnts(): List[Account] = {
        acnts.filter(acnt => acnt.balance < 0)
    }

    def getSum(): Double = {
        val balances = acnts.map(_.balance)
        balances.sum
    }

    def updateAcntBal() = {
        acnts.map((acnt) => {
            if (acnt.balance > 0)
                acnt.balance = acnt.balance * (1.05)
            else
                acnt.balance = acnt.balance * (1.1)
            }
        )
    }

    getNegativeBalAcnts().foreach(acnt => print("Account " + acnt.accountNumber + ": " + "Balance: " + acnt.balance + "; "))
    println("Sum: " + getSum())
    updateAcntBal()
    acnts.foreach(acnt => print("Account " + acnt.accountNumber + ": " + "Balance: " + acnt.balance + "; "))
}