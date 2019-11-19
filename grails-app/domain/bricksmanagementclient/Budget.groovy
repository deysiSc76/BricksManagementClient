package bricksmanagementclient

class Budget {
    int totalAmount
    int workId

    static hasMany = [charges: Charge, budgetDetails: BudgetDetail]

    static constraints = {
    }
}
