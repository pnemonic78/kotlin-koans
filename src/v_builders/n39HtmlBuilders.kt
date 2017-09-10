package v_builders

import v_builders.data.Product
import v_builders.data.getProducts
import v_builders.htmlLibrary.*

fun getTitleColor() = "#b9c9fe"
fun getCellColor(row: Int, column: Int) = if ((row + column) % 2 == 0) "#dce4ff" else "#eff2ff"

fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products: List<Product> = getProducts()
            for ((row, product) in products.withIndex()) {
                tr {
                    td(getCellColor(row, 0)) {
                        text(product.description)
                    }
                    td(getCellColor(row, 1)) {
                        text(product.price)
                    }
                    td(getCellColor(row, 2)) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}
