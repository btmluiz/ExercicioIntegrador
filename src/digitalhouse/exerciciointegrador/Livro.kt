package digitalhouse.exerciciointegrador

import kotlin.properties.Delegates

data class Livro(
        override var quantidadeEstoque: Int,
        override var preco: Double,
        var titulo: String,
        var autor: String,
        var anoLancamento: String
) : Produto {
    override var codigo by Delegates.notNull<Int>()
}