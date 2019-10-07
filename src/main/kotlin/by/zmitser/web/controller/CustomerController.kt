package by.zmitser.web.controller

import by.zmitser.service.CustomerService
import by.zmitser.web.model.CustomerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus.CREATED
import io.micronaut.http.HttpStatus.NO_CONTENT
import io.micronaut.http.annotation.*
import io.micronaut.http.simple.SimpleHttpResponseFactory.INSTANCE
import java.util.*

@Controller("/api/v1/customers")
class CustomerController(private val service: CustomerService) {

    @Get("/{id}")
    fun findOne(@PathVariable id: UUID): HttpResponse<CustomerDto> = INSTANCE.ok(service.findOne(id))

    @Post
    fun save(customer: CustomerDto): HttpResponse<CustomerDto> {
        val savedCustomer = service.save(customer)
        return INSTANCE.status(CREATED, savedCustomer)
                .header("Location", "/api/v1/customers/${savedCustomer.id}")
    }

    @Put("/{id}")
    @Status(NO_CONTENT)
    fun update(@PathVariable id: UUID, customer: CustomerDto) {
        service.update(id, customer)
    }

    @Delete("/{id}")
    @Status(NO_CONTENT)
    fun delete(@PathVariable id: UUID) {
        service.delete(id)
    }


}