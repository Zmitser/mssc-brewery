package by.zmitser.web.mapper

import by.zmitser.domain.Beer
import by.zmitser.web.model.BeerDto
import org.mapstruct.Mapper

@Mapper(
        componentModel = "jsr330",
        uses = [DateMapper::class]
)
interface BeerMapper {

    fun beerToBeerDto(beer: Beer): BeerDto

    fun beerDtoToBeer(beerDto: BeerDto): Beer
}