package by.zmitser.domain

import java.util.*

data class Beer(var id: UUID?, var beerName: String?, var beerStyle: BeerStyleEnum?, var upc: Long?) {

    constructor() : this(null, null, null, null)

    enum class BeerStyleEnum {
        LAGER, PILSNER, STOUT, GOSE, PORTER, ALE, WHEAT, IPA, PALE_ALE, SAILSON
    }
}
