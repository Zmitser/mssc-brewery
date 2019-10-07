package by.zmitser.service

import by.zmitser.web.model.CustomerDto
import java.util.*

interface CustomerService {

    fun findOne(id: UUID): CustomerDto
    fun save(customer: CustomerDto): CustomerDto
    fun update(id: UUID, customer: CustomerDto)
    fun delete(id: UUID)
}