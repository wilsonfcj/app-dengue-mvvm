package aluno.ifsc.app.focos.dengue.data.resources.response

import com.google.gson.annotations.SerializedName

open class BaseResponse< Data : Any?>(
    @SerializedName("Sucesso")
    val success: Boolean = false,
    @SerializedName("Mensagem")
    val message: String? = "",
    @SerializedName("Data")
    var data: Data? = null
)