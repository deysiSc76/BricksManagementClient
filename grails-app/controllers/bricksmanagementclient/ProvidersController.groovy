package bricksmanagementclient

class ProvidersController {
    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max){
        // TODO: Traer del service
        def providers = new ArrayList<Provider>()
        def p = new Provider()
        p.setAddress("Avd Siempre Viva")
        p.setBusinessName("Simp House")
        p.setNumber(985749363)
        p.setRuc("4315943-0")
        providers.add(p)

        [providerInstanceList: providers, providerInstanceTotal: providers.size()]
    }
}
