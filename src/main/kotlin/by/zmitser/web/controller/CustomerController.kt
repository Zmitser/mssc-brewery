package by.zmitser.web.controller

import by.zmitser.service.CustomerService
import by.zmitser.web.model.CustomerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.simple.SimpleHttpResponseFactory.INSTANCE
import java.util.*

@Controller("/api/v1/customers")
class CustomerController(private val service: CustomerService) {

    @Get("/{id}")
    fun findOne(@PathVariable id:UUID):HttpResponse<CustomerDto> = INSTANCE.ok(service.findOne(id));

}