package digitalhouse.exerciciointegrador

class Livro(
        var titulo: String,
        var autor: String,
        var anoLancamento: String,
        override var quantidadeEstoque: Int,
        override var preco: Double
) : Produto {
    override var codigo = 0
    override fun toString(): String {
        return "Livro(titulo='$titulo', autor='$autor', anoLancamento='$anoLancamento', quatidade='$quantidadeEstoque')"
    }
}