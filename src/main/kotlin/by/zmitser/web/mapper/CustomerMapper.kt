package by.zmitser.web.mapper

import by.zmitser.domain.Customer
import by.zmitser.web.model.CustomerDto
import org.mapstruct.Mapper

@Mapper(
        componentModel = "jsr330"
)
interface CustomerMapper {

    fun customerToCustomerDto(customer: Customer): CustomerDto

    fun customerDtoToCustomer(customerDto: CustomerDto): Customer
}