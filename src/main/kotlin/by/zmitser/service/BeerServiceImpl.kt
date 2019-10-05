package by.zmitser.service

import by.zmitser.web.model.BeerDto
import java.util.*
import javax.inject.Singleton

@Singleton
class BeerServiceImpl : BeerService {

    override fun findOne(id: UUID): BeerDto = BeerDto(UUID.randomUUID(), "Galaxy Cat", "Pale Ale")

}