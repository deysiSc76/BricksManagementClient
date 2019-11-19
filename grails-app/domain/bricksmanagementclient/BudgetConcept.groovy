package bricksmanagementclient

class BudgetConcept {
    String description

    static hasMany = [budgetDetails: BudgetDetail, paymentConcept: PaymentConcept]

    static constraints = {
    }
}
