package aluno.ifsc.app.focos.dengue.api

import aluno.ifsc.app.focos.dengue.data.resources.request.UserRequest
import aluno.ifsc.app.focos.dengue.data.resources.response.BaseResponse
import aluno.ifsc.app.focos.dengue.data.resources.response.UserResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT

interface UserService {

    @POST("Login")
    suspend fun login(@Body request: UserRequest.Login): BaseResponse<UserResponse.Login>

    @POST("Cadastro")
    suspend fun register(@Body request: UserRequest.Register): BaseResponse<UserResponse.Login>

    @PUT("Alterar")
    suspend fun update(@Body request: UserRequest.Register): BaseResponse<UserResponse.Login>

    @POST("EnviarEmail")
    suspend fun sendEmail(@Body request: UserRequest.Email): BaseResponse<Boolean>

}