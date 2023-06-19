object Salary {
    def main(args: Array[String]) = {
        val numOfNormalWorkingHours = 40
        val numOfOTHours = 30
        val normalWorkingHour = 250
        val OTHour = 85
        val tax = 0.12
        println(calculateSalary(normalWorkingHour, OTHour, tax, numOfNormalWorkingHours, numOfOTHours))
    }

    def calculateSalary(normalWorkingHour: Int, OTHour: Int, tax: Double, numOfNormalWorkingHours: Int, numOfOTHours: Int): Double = {
        val grossSalary =  (normalWorkingHour*numOfNormalWorkingHours)+(OTHour*numOfOTHours) 
        grossSalary-(grossSalary*tax)
    }
}