package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {

    suspend fun listRepositories(User: String): Flow<List<Repo>>
}