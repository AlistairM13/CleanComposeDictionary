package com.machado.greprepper.domain.repository

import com.machado.greprepper.domain.model.WordInfo
import com.machado.greprepper.util.Resource
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>

}