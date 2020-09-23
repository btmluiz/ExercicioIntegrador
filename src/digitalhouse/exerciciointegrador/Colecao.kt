package digitalhouse.exerciciointegrador

import kotlin.properties.Delegates

data class Colecao(
        override var quantidadeEstoque: Int,
        override var preco: Double,
        var titulo: String,
        var autor: String,
        var anoLancamento: Int,
        var livros: MutableList<Livro>
) : Produto{
    override var codigo by Delegates.notNull<Int>()
}
