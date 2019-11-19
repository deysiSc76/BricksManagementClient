package bricksmanagementclient

class User {
    String name
    String lastName
    int number
    String document
    String address
    String commentary
    String email
    String password

    static hasMany = [charges: Charge, personalDebts: PersonalDebt]

    static constraints = {
    }
}
