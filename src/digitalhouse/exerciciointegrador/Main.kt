package digitalhouse.exerciciointegrador

fun main(){

    println("Seja bem-vindo a Livraria Digital")
    // Livro (titulo: String, autor: String, anoLancamento: String, quantidade: Int, preco: Double)
    val livro1 = Livro("L1", "A1", 2019, 3, 10.5)
    val livro2 = Livro("L2", "A1", 2019, 3, 10.5)
    val livro3 = Livro("L3", "A1", 2019, 3, 10.5)

    // Colecao(titulo: String, autor: String, anoLancamento: Int, livros: MutableList<Livro>,quantidadeEstoque: Int, preco: Double )
    val colecao = Colecao("C-L", "A1", 2020, mutableListOf(livro1, livro2, livro3), 5, 28.9)

    val livraria = Livraria()

    val clivro1 = livraria.cadastrar(livro1)
    val clivro2 = livraria.cadastrar(livro2)
    val clivro3 = livraria.cadastrar(livro3)
    val ccolecao = livraria.cadastrar(colecao)

    livraria.consultar(4)
    livraria.consultar(clivro1)

    livraria.consultar(7)
    livraria.consultar(ccolecao)

    livraria.efetuarVenda(clivro1)
    livraria.efetuarVenda(ccolecao)

    println("[Livraria Digital] ${livraria}")
}