package by.zmitser.web.model

import java.util.*

data class CustomerDto(var id: UUID?, var name: String?) {
    constructor() : this(null, null)
}