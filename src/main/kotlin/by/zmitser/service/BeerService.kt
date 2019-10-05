package by.zmitser.service

import by.zmitser.web.model.BeerDto
import java.util.*
import javax.inject.Singleton



interface BeerService {

    fun findOne(id:UUID):BeerDto
}