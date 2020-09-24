package digitalhouse.exerciciointegrador

class Livraria {
    private var contador = 0
    val estoque = mutableMapOf<Int, Produto>()

    fun cadastrar(livro: Livro): Int {
        contador++
        livro.codigo = contador
        estoque[contador] = livro
        println("[Livraria Digital] Livro: ${livro.titulo} cadastrado com sucesso")
        return contador
    }

    fun cadastrar(colecao: Colecao): Int {
        contador++
        colecao.codigo = contador
        estoque[contador] = colecao
        println("[Livraria Digital] Coleção: ${colecao.titulo} cadastrado com sucesso")
        return contador
    }

    fun consultar(codigo: Int) {
        when {
            estoque.contains(codigo) -> println("[Livraria Digital] ${estoque[codigo]}")
            else -> println("[Livraria Digital] Livro ou Coleção não encontrada")
        }
    }

    fun efetuarVenda(codigo: Int): Unit {
        when {
            estoque.contains(codigo) -> {
                when {
                    estoque[codigo]?.quantidadeEstoque!! > 0 -> {
                        estoque[codigo]?.quantidadeEstoque = estoque[codigo]?.quantidadeEstoque!! - 1
                        println("[Livraria Digital] Venda efetuado com sucesso")
                    }
                    else -> println("[Livraria Digital] Estoque esgotado")
                }
            }
            else -> println("[Livraria Digital] Livro não encontrado")
        }
    }

    override fun toString(): String {
        return "Livraria(contador=$contador, estoque=$estoque)"
    }
}