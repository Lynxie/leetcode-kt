package playground.library

import playground.library.repository.BookRepository
import playground.library.repository.ClientRepository

class Library (
    val bookRepo: BookRepository,
    val clientRepo: ClientRepository,
) {


    companion object {
        fun getInstance(): Library {
            return Library(
                BookRepository(),
                ClientRepository()
            )
        }
    }

}