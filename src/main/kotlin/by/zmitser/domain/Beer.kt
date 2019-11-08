package by.zmitser.domain

import java.sql.Timestamp
import java.util.*

data class Beer(var id: UUID?,
                var beerName: String?,
                var beerStyle: BeerStyleEnum?,
                var upc: Long?,
                var createdDate: Timestamp?,
                var lastUpdatedDate: Timestamp?) {

    constructor() : this(null, null, null, null, null, null)

    enum class BeerStyleEnum {
        LAGER, PILSNER, STOUT, GOSE, PORTER, ALE, WHEAT, IPA, PALE_ALE, SAILSON
    }
}
