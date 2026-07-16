package playground.library.repository

import playground.library.data.Book

class BookRepository {

    val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun getBooks(title: String? = null): List<Book> {
        return books.filter {
            if (title != null && !it.title.contains(title)) {
                return@filter false
            }
            true
        }
    }

}