// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nomeUsuario:String, val matricula: String)

data class ConteudoEducacional(val nomeCurso: String, val duracao: Int = 240)
val nomecurso = ListOf("Curso Java","Cuso Kotlin")

data class Formacao(val nomeFormação: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    for (inscritos in inscrito) {                               // 1
    println("O candidato foi inscrito no $nomecurso ")
}
    
    fun matricular(usuario: Usuario) {

        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
   val nivel = Nivel.BASICO                         // 2
    val message = when (nivel) {                      // 3
        Nivel.BASICO -> "Inicio o nivel básico"
        Nivel.INTERMEDIARIO -> "Deu inicio ao nivel Intermediario"
        Nivel.AVANCADO -> "Parabéns atingiu o nivel Avançado."
    }
    println(message)
}
