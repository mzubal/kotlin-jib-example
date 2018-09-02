package cz.zubal.jib.kotlinjibexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinJibExampleApplication

fun main(args: Array<String>) {
    runApplication<KotlinJibExampleApplication>(*args)
}


@RestController
class HelloRestController {

    @GetMapping("hello")
    fun hello(): String {
        return "Hello World!"
    }

}
