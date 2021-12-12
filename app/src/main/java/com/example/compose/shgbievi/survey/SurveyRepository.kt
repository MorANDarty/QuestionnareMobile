package com.example.compose.shgbievi.survey

import com.example.compose.jetsurvey.R

// Static data of questions
private val firstQuestions = mutableListOf(
    Question(
        id = 1,
        questionText = R.string.best_anime_question1,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki,
                R.string.shingeki1,
                R.string.shingeki2,
                R.string.shingeki3
            )
        ),
    ),
    Question(
        id = 2,
        questionText = R.string.best_anime_question,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki2,
                R.string.shingeki,
                R.string.shingeki1,
                R.string.shingeki3
            )
        ),
    ),
    Question(
        id = 3,
        questionText = R.string.best_anime_question2,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki3,
                R.string.shingeki1,
                R.string.shingeki2,
                R.string.shingeki,
            )
        ),
    ),
    Question(
        id = 4,
        questionText = R.string.best_anime_question3,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.shingeki,
                R.string.shingeki1,
                R.string.shingeki2,
                R.string.shingeki3
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
                R.string.eva1,
                R.string.eva3,
                R.string.eva2,
                R.string.evangelion,
            )
        ),
    ),
    Question(
        id = 2,
        questionText = R.string.bad_anime_question2,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.evangelion,
                R.string.eva1,
                R.string.eva2,
                R.string.eva3
            )
        ),
    ),
    Question(
        id = 3,
        questionText = R.string.bad_anime_question1,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.eva1,
                R.string.evangelion,
                R.string.eva3,
                R.string.eva2,
            )
        ),
    ),
    Question(
        id = 4,
        questionText = R.string.bad_anime_question3,
        answer = PossibleAnswer.SingleChoice(
            listOf(
                R.string.evangelion,
                R.string.eva1,
                R.string.eva2,
                R.string.eva3
            )
        ),
    )
).toList()

private val bestAnimeSurvey = Survey(
    title = R.string.best_anime,
    questions = firstQuestions
)

private val badAnimeSurvey = Survey(
    title = R.string.bad_anime,
    questions = secondQuestions
)

object SurveyRepository {

    fun getBestAnimeSurvey() = bestAnimeSurvey
    fun getBadAnimeSurvey() = badAnimeSurvey

    @Suppress("UNUSED_PARAMETER")
    fun getBestAnimeResult(answers: List<Answer<*>>): SurveyResult {
        return SurveyResult(
            library = "",
            result = R.string.survey_result,
            description = R.string.survey_result_description
        )
    }

    fun getBadAnimeResult(): SurveyResult =
        SurveyResult(
            library = "",
            result = R.string.result_bad_anime,
            description = R.string.bad_anime_result_desc
        )
}

object PickedSurveyRepo {
    var pickedSurvey: Int? = null
}

