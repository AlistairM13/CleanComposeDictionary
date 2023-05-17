package com.machado.greprepper.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.machado.greprepper.domain.model.Meaning
import com.machado.greprepper.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String,
    @PrimaryKey(autoGenerate = true) val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            phonetic = phonetic,
            word = word
        )
    }
}