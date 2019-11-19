package bricksmanagementclient

class Payment {

    int total
    String date
    String documentType
    int number
    int stamping
    int billType

    static hasOne = [work: Work, debt: PersonalDebt, provider: Provider]
    static hasMany = [paymentDetails: PaymentDetail]

    static constraints = {
    }
}
