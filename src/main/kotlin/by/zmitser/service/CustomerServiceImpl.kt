package by.zmitser.service

import by.zmitser.web.model.CustomerDto
import mu.KotlinLogging
import org.slf4j.Logger
import java.util.*
import javax.inject.Singleton

@Singleton
class CustomerServiceImpl(private val logger: Logger = KotlinLogging.logger { }) : CustomerService {

    override fun save(customer: CustomerDto): CustomerDto {
        return CustomerDto(UUID.randomUUID(), "Robert")
    }

    override fun update(id: UUID, customer: CustomerDto) {
        TODO("Not implemented yet")

    }

    override fun delete(id: UUID) {
        logger.debug("Deleting...")
    }

    override fun findOne(id: UUID): CustomerDto = CustomerDto(UUID.randomUUID(), "Steve")
}