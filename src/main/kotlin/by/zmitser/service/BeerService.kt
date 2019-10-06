package by.zmitser.service

import by.zmitser.web.model.BeerDto
import java.util.*
import javax.inject.Singleton


interface BeerService {

    fun findOne(id: UUID): BeerDto
    fun save(beer: BeerDto): BeerDto
    fun update(id: UUID, beer: BeerDto): BeerDto
    fun delete(id: UUID)
}