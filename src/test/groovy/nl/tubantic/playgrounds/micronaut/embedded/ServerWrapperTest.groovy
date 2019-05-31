package nl.tubantic.playgrounds.micronaut.embedded

import spock.lang.Specification

class ServerWrapperTest extends Specification {
    def "someLibraryMethod returns true"() {
        given:
        println 'Setup of the only test'
        def server = new ServerWrapper()

        when:
        def result = server.startUpServer()

        then:
        result
    }
}
