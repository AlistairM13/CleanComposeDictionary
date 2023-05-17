package com.machado.greprepper.domain.use_case

import com.machado.greprepper.domain.model.WordInfo
import com.machado.greprepper.domain.repository.WordInfoRepository
import com.machado.greprepper.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfoUseCase(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()) {
            return flow {}
        }
        return repository.getWordInfo(word)
    }

}