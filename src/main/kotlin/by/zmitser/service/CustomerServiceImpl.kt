package by.zmitser.service

import by.zmitser.web.model.CustomerDto
import java.util.*
import javax.inject.Singleton

@Singleton
class CustomerServiceImpl : CustomerService {

    override fun findOne(id: UUID): CustomerDto = CustomerDto(UUID.randomUUID(), "Steve")
}