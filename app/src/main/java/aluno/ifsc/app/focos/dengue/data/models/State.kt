package aluno.ifsc.app.focos.dengue.data.models

import java.io.Serializable


data class State (
    var codeState: Int? = null,
    var initials: String? = null,
    var name: String? = null
) : Serializable