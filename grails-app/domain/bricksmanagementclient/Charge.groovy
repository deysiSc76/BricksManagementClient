package bricksmanagementclient

class Charge {
    String description
    int amount
    String date

    static hasOne = [budget: Budget, client: User]

    static constraints = {
    }
}
