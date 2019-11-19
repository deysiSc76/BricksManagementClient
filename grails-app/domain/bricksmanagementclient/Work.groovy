package bricksmanagementclient

class Work {
    String name
    String description
    String address
    String startDate
    String endDate
    String personnelManager

    static hasOne = [client: User, budget: Budget]
    static hasMany = [payments: Payment]

    static constraints = {
    }
}
