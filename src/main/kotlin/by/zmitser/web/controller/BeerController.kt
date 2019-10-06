package by.zmitser.web.controller

import by.zmitser.service.BeerService
import by.zmitser.web.model.BeerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponseFactory
import io.micronaut.http.HttpStatus.CREATED
import io.micronaut.http.HttpStatus.NO_CONTENT
import io.micronaut.http.annotation.*
import io.micronaut.http.simple.SimpleHttpResponseFactory.INSTANCE
import java.util.*

@Controller("/api/v1/beers")
class BeerController(private val service: BeerService) {

    @Get("/{id}")
    fun findOne(@PathVariable id: UUID): HttpResponse<BeerDto> = INSTANCE.ok(service.findOne(id))

    @Post
    fun save(beer: BeerDto): HttpResponse<BeerDto> {
        val savedBeer = service.save(beer);
        return INSTANCE.status<BeerDto>(CREATED, savedBeer)
                .header("Location", "/api/v1/beers/${savedBeer.id.toString()}")
    }

    @Put("/{id}")
    fun update(@PathVariable id: UUID, beer: BeerDto):HttpResponse<Any>{
        service.update(id, beer)
        return HttpResponseFactory.INSTANCE.status(NO_CONTENT)
    }

    @Delete("/{id}")
    @Status(NO_CONTENT)
    fun delete(@PathVariable id: UUID) {
        service.delete(id)
    }
}