package aluno.ifsc.app.focos.dengue.data.resources.request

import aluno.ifsc.app.focos.dengue.data.models.User
import com.google.gson.annotations.SerializedName
import kotlin.collections.ArrayList

sealed class UserRequest {

    open class Email(
        @SerializedName("Assunto")
        var assunto: String? = null,

        @SerializedName("Mensagem")
        var mensagem: String? = null
    )

    open class Login(
        @field:SerializedName("CPF")
        var cpf: String? = null,

        @field:SerializedName("Senha")
        var password: String? = null
    )

    open class Register {
        @SerializedName(value = "CPF")
        var cpf: String? = null

        @SerializedName(value = "Nascimento")
        var birthday: String? = null

        @SerializedName(value = "Nome")
        var name: String? = null

        @SerializedName(value = "Email")
        var email: String? = null

        @SerializedName(value = "Telefone")
        var phone: String? = null

        @SerializedName(value = "ImagemUsuario")
        var photoPerfil: String? = null

        @SerializedName(value = "Senha")
        var password: String? = null


        fun transform(it: User): Register {
            val user =  Register()
            user.cpf = it.cpf
//            user.birthday = StringUtil.data( it.birthDay!!,"yyyy-MM-dd'T'HH:mm:ss")
            user.name = it.name
            user.email = it.email
            user.phone = it.phone

            if(it.imageUser != null) {
                user.photoPerfil = it.imageUser
            }

            return user
        }

        fun transform(list: MutableList<User>): MutableList<Register> {
            val listRes = ArrayList<Register>()
            list.forEach {
                listRes.add(transform(it))
            }
            return listRes
        }
    }
}