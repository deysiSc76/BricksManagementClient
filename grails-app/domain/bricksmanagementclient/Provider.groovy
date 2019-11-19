package bricksmanagementclient

class Provider {
    String businessName
    int number
    String address
    String ruc

    static hasMany = [payments: Payment, paymentConcept: PaymentConcept]

    static constraints = {
    }
}
