package bricksmanagementclient

class BudgetDetail {
    int amount
    int quantity

    static hasOne = [budget: Budget, budgetConcept: BudgetConcept]

    static constraints = {
    }
}
