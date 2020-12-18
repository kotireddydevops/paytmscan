application {
    title = 'app'
    startupGroups = ['app']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "app"
    'app' {
        model      = 'paytm.AppModel'
        view       = 'paytm.AppView'
        controller = 'paytm.AppController'
    }
}