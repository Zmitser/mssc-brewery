package by.zmitser.web.controller

import by.zmitser.service.BeerService
import by.zmitser.web.model.BeerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.simple.SimpleHttpResponseFactory.INSTANCE
import java.util.*

@Controller("/api/v1/beers")
class BeerController(private val service: BeerService) {

    @Get("/{id}")
    fun findOne(@PathVariable id: UUID): HttpResponse<BeerDto> = INSTANCE.ok(service.findOne(id))
}