package aluno.ifsc.app.focos.dengue.api

import aluno.ifsc.app.focos.dengue.data.resources.request.FocoRequest
import aluno.ifsc.app.focos.dengue.data.resources.response.BaseResponse
import aluno.ifsc.app.focos.dengue.data.resources.response.FocoResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface PointAedesService {
    @POST("CadastrarFoco")
    suspend fun register(@Body request : FocoRequest.Register) : Call<BaseResponse<FocoResponse.Register>>

    @GET("BuscarFocos")
    suspend fun searchAllFocos() : Call<BaseResponse<MutableList<FocoResponse.Register>>>

    @GET("BuscarFocosPorId")
    suspend fun searchAllFocosById(@Query("idUsuario") idUsuario : Long) : Call<BaseResponse<MutableList<FocoResponse.Register>>>
}