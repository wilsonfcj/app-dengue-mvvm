package aluno.ifsc.app.focos.dengue.di

import aluno.ifsc.app.focos.dengue.api.PointAedesService
import aluno.ifsc.app.focos.dengue.api.UserService
import aluno.ifsc.app.focos.dengue.utilities.RetrofitImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideUserService() : UserService {
        return RetrofitImpl().buildRetrofit().create(UserService::class.java)
    }

    @Singleton
    @Provides
    fun providePointAedesService() : PointAedesService {
        return RetrofitImpl().buildRetrofit().create(PointAedesService::class.java)
    }

}