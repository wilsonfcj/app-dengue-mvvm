package aluno.ifsc.app.focos.dengue.ui

import aluno.ifsc.app.focos.dengue.data.resources.UserRepository
import aluno.ifsc.app.focos.dengue.data.resources.request.UserRequest
import aluno.ifsc.app.focos.dengue.data.resources.response.BaseResponse
import aluno.ifsc.app.focos.dengue.data.resources.response.UserResponse
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject


@HiltViewModel
class UserViewModel @Inject constructor(
    private val repository : UserRepository
) : ViewModel() {

    private var loginResult: Flow<BaseResponse<UserResponse.Login>>? = null

    fun login(query : UserRequest.Login) : Flow<BaseResponse<UserResponse.Login>> {
        val newResult: Flow<BaseResponse<UserResponse.Login>> = repository.authLoginUser(query)
        return newResult
    }

}