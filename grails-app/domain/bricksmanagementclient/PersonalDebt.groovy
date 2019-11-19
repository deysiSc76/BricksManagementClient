package bricksmanagementclient

class PersonalDebt {
    int amount
    String description

    static hasOne = [user: User]
    static hasMany = [payments: Payment]

    static constraints = {
    }
}
