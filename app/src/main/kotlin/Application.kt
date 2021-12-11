package genericapi

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;

public fun main(args: Array<String>): Unit {
    runApplication<Application>(*args)
}

@SpringBootApplication
public abstract class Application
