package aluno.ifsc.app.focos.dengue.data.resources

import aluno.ifsc.app.focos.dengue.api.UserService
import aluno.ifsc.app.focos.dengue.data.resources.request.UserRequest
import aluno.ifsc.app.focos.dengue.data.resources.response.BaseResponse
import aluno.ifsc.app.focos.dengue.data.resources.response.UserResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepository @Inject constructor(private val service: UserService) {

    suspend fun authLoginUser(query: UserRequest.Login): Flow<BaseResponse<UserResponse.Login>> = flow {
        val response = service.login(query)
        emit(response)
    }

}