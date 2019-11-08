package by.zmitser.web.model

import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Null
import javax.validation.constraints.Positive


data class BeerDto(
        @Null var id: UUID?,
        @NotBlank var beerName: String?,
        @NotBlank var beerStyle: String?,
        @Positive var upc: Long?) {

    constructor() : this(null, null, null, null)
    constructor(id: UUID?, beerName: String?, beerStyle: String?) : this(id, beerName, beerStyle, null)
}