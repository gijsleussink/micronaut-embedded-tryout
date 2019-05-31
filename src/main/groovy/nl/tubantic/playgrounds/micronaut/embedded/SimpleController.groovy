package nl.tubantic.playgrounds.micronaut.embedded

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/simple')
class SimpleController {

    @Get(produces = MediaType.TEXT_PLAIN)
    String index2() {
        'Hello World'
    }
}