package by.zmitser.service

import by.zmitser.web.model.BeerDto
import mu.KotlinLogging
import org.slf4j.Logger
import java.util.*

import javax.inject.Singleton

@Singleton
class BeerServiceImpl : BeerService {
    private val logger: Logger = KotlinLogging.logger { }
    override fun save(beer: BeerDto): BeerDto = BeerDto(UUID.randomUUID(), "", "");
    override fun update(id: UUID, beer: BeerDto): BeerDto {
        logger.info("Update a beer...")
        return BeerDto()
    }

    override fun findOne(id: UUID): BeerDto = BeerDto(UUID.randomUUID(), "Galaxy Cat", "Pale Ale")

    override fun delete(id: UUID) {
        logger.info("Deleting a beer...")
    }

}