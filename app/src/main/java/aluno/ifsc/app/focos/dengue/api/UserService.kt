package aluno.ifsc.app.focos.dengue.api

import retrofit2.http.POST
import retrofit2.http.PUT

interface UserService {
    @POST("Login")
    suspend fun login()

    @POST("Cadastro")
    suspend fun register()

    @PUT("Alterar")
    suspend fun update()

    @POST("EnviarEmail")
    suspend fun sendEmail()
}