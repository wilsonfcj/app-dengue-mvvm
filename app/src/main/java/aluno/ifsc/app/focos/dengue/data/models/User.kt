package aluno.ifsc.app.focos.dengue.data.models

import java.io.Serializable
import java.util.*

data class User (
    var idUser: Long? = null,
    var cpf: String? = null,
    var birthDay: Date? = null,
    var name: String? = null,
    var email: String? = null,
    var phone: String? = null,
    var imageUser: String? = null
) : Serializable