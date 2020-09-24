package digitalhouse.exerciciointegrador

class Colecao(
        var titulo: String,
        var autor: String,
        var anoLancamento: Int,
        var livros: MutableList<Livro>,
        override var quantidadeEstoque: Int,
        override var preco: Double
) : Produto {
    override var codigo = 0

    override fun toString(): String {
        var string_livros = ""
        livros.forEach { string_livros += it.titulo + ", " }
        return "Coleção(titulo='$titulo', autor='$autor', anoLancamento='$anoLancamento', quatidade='$quantidadeEstoque', livros='$string_livros')"
    }
}