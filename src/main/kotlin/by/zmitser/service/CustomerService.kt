package by.zmitser.service

import by.zmitser.web.model.CustomerDto
import java.util.*

interface CustomerService {

    fun findOne(id: UUID): CustomerDto
}