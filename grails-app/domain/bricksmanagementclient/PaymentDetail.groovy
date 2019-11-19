package bricksmanagementclient

class PaymentDetail {
    int unitPrice
    int quantity

    static hasOne = [payment: Payment, relatedPayment: Payment, paymentConcept: PaymentConcept]

    static constraints = {
    }
}
