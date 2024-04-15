package io.purgil.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaServiceApplication

fun main(args: Array<String>) {
	runApplication<EurekaServiceApplication>(*args)
}
