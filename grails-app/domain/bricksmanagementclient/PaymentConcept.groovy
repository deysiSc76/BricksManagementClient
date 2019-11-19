package bricksmanagementclient

class PaymentConcept {
    String name
    int cost
    String description
    boolean material

    static hasOne = [budgetConcept: BudgetConcept, provider: Provider]
    static hasMany = [paymentDetails: PaymentDetail]

    static constraints = {
    }
}
