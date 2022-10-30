package com.interviewprep.clean_architecture.data.models

import kotlinx.serialization.Serializable

@Serializable
data class QuestionModel(
    val question: String,
    val details: String,
    val shortAns: String,
    val trueOrFalse: Boolean,
)

@Serializable
data class QuestionsListModel(
    val questions: List<QuestionModel>
)