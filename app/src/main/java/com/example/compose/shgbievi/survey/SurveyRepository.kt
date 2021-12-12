package com.example.compose.shgbievi.survey

import android.os.Build
import com.example.compose.jetsurvey.R

// Static data of questions
private val jetpackQuestions = mutableListOf(
    Question(
        id = 1,
        questionText = R.string.best_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki
            )
        ),
    ),
    Question(
        id = 1,
        questionText = R.string.best_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki
            )
        ),
    ),
    Question(
        id = 1,
        questionText = R.string.best_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki
            )
        ),
    ),
    Question(
        id = 1,
        questionText = R.string.best_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki,
                R.string.shingeki
            )
        ),
    )
).toList()

private val secondQuestions = mutableListOf(
    Question(
        id = 1,
        questionText = R.string.bad_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion
            )
        ),
    ),
    Question(
        id = 1,
        questionText = R.string.bad_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion
            )
        ),
    ),
    Question(
        id = 1,
        questionText = R.string.bad_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion
            )
        ),
    ),
    Question(
        id = 1,
        questionText = R.string.bad_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion,
                R.string.evangelion
            )
        ),
    )
).toList()

private val jetpackSurvey = Survey(
    title = R.string.which_jetpack_library,
    questions = jetpackQuestions
)

object SurveyRepository {

    suspend fun getSurvey() = jetpackSurvey

    @Suppress("UNUSED_PARAMETER")
    fun getSurveyResult(answers: List<Answer<*>>): SurveyResult {
        return SurveyResult(
            library = "Compose",
            result = R.string.survey_result,
            description = R.string.survey_result_description
        )
    }
}
