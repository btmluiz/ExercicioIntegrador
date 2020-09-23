package digitalhouse.exerciciointegrador

data class Livro(
        override var codigo: Int,
        override var quantidadeEstoque: Int,
        override var preco: Double,
        var titulo: String,
        var autor: String,
        var anoLancamento: String
) : Produto