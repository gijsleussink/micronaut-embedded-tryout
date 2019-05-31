package nl.tubantic.playgrounds.micronaut.embedded

import groovy.util.logging.Slf4j
import io.micronaut.context.ApplicationContext

@Slf4j
class ServerWrapper {
    boolean startUpServer() {
        def context = ApplicationContext.build()
                .packages('nl.tubantic.playgrounds.micronaut.embedded')
                .start()

        log.info('Bean found: {}', context.getBean(SimpleController))
        log.info 'Server started'
        context.stop()
        log.info 'Server stopped'
        true
    }
}
