package genericapi

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration

@Configuration
object MyStaticObject {

    @Value("\${foo.name}")
    val name = ""
}
