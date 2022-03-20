package aluno.ifsc.app.focos.dengue.data.resources.request

import com.google.gson.annotations.SerializedName

sealed class FocoRequest {

    open class Register(
        @SerializedName("Descricao")
        var descricao : String? = null,

        @SerializedName("Endereco")
        var  endereco : String? = null,

        @SerializedName("Latitude")
        var latitude : Double? = null,

        @SerializedName("Longitude")
        var longitude : Double? = null,

        @SerializedName("Imagem")
        var image: String? = null,

        @SerializedName("DataCadastro")
        var dataCadastro : String? = null,

        @SerializedName("IdUsuario")
        var idUsuario : Long? = null
    )
}