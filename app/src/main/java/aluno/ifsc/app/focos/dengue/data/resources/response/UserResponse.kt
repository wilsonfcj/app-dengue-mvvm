package aluno.ifsc.app.focos.dengue.data.resources.response

import com.google.gson.annotations.SerializedName
import java.util.*

sealed class UserResponse {

    open class Login(
        @field:SerializedName("IdUsuario")
        var _id: Long? = null,

        @field:SerializedName("CPF")
        var cpf: String? = null,

        @field:SerializedName("Nascimento")
        var birthDay: Date? = null,

        @field:SerializedName("Nome")
        var name: String? = null,

        @field:SerializedName("Email")
        var email: String? = null,

        @field:SerializedName("Telefone")
        var phone: String? = null,

        @field:SerializedName("Instituicao")
        var educationalInstitution: EducationalInstitution? = null,

        @field:SerializedName("ImagemUsuario")
        var imageUser: String? = null,

        @field:SerializedName("TipoUsuario")
        var userType: Int? = null,

        @field:SerializedName("Matricula")
        var registration: Long? = null,

        @field:SerializedName("AnoIngresso")
        var anoIngresso: Long? = null,

        @field:SerializedName("DisciplinasInteressadas")
        var matters : MutableList<Matter>? = null
    )

    open class EducationalInstitution (
        @field:SerializedName("Id")
        var _id: Long? = null,

        @field:SerializedName("Nome")
        var name: String? = null
    )

    open class Matter (
        @field:SerializedName("Codigo")
        var cod: Int? = null,

        @field:SerializedName("Nome")
        var name: String? = null
    )


}