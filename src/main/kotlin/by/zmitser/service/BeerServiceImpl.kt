package by.zmitser.service

import by.zmitser.web.model.BeerDto
import mu.KotlinLogging
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Singleton

@Singleton
class BeerServiceImpl(private val logger: Logger = KotlinLogging.logger {  }) : BeerService {

    override fun save(beer: BeerDto): BeerDto = BeerDto(UUID.randomUUID(), "", "");
    override fun update(id: UUID, beer: BeerDto): BeerDto {
        TODO("add real implementation")
    }

    override fun findOne(id: UUID): BeerDto = BeerDto(UUID.randomUUID(), "Galaxy Cat", "Pale Ale")

    override fun delete(id: UUID) {
        logger.info("Deleting a beer...")
    }

}