package hello.world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping()
    fun sayHello(@RequestParam(value = "name") name: String) =
        HelloWorld(name)
}