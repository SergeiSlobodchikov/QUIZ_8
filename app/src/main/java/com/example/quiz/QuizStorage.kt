package com.example.quiz

import com.example.quiz.Quiz

object QuizStorage {
    fun getQuiz(locale: Locale): Quiz = when (locale) {
        Locale.Ru -> quizRu
        Locale.En -> quizEn
    }

    enum class Locale {
        Ru, En
    }

    private val quizRu = object : Quiz {
        override val questions: List<Question> = listOf(
            Question(
                question = "Сколько участников в kpop группе BTS?",
                answers = listOf(
                    "0",
                    "7",
                ),
            ),
            Question(
                question = "Как называется лейбл звукозаписи chief keef-a?",
                answers = listOf(
                    "GLO GANG",
                    "DRAIN GANG",
                ),
            ),
            Question(
                question = "Настоящее имя исполнителя Blood Orange?",
                answers = listOf(
                    "Devonté Hynes",
                    "Rakim Athelaston Mayers",
                ),
            ),
        )
    }


    private val quizEn = object : Quiz {
        override val questions: List<Question> = listOf(
            Question(
                question = "How many members are in kpop group BTS?",
                answers = listOf(
                    "0",
                    "7",
                ),
            ),
            Question(
                question = "What is the name of the record label of chief keef-a?",
                answers = listOf(
                    "GLO GANG",
                    "DRAIN GANG",
                ),
            ),
            Question(
                question = "The real name of the artist Blood Orange?",
                answers = listOf(
                    "Devonté Hynes",
                    "Rakim Athelaston Mayers",
                ),
            ),
        )
    }
}