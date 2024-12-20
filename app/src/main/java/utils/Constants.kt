package utils
import com.example.quizapp2.R
import model.Question

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val SCORE: String = "score"

    fun getQuestions(): MutableList<Question> {
        val questionsList = mutableListOf<Question>()


        val quest1 = Question(
            1,
            "À quel pays appartient ce drapeau ?",
            R.drawable.morocco,
            "Maroc", "Egypte", "France", "Espagne", 1
        )
        questionsList.add(quest1)


        val quest2 = Question(
            2,
            "Quel est le capital de la France ?",
            R.drawable.france_flag,
            "Paris", "Lyon", "Marseille", "Nice", 1
        )
        questionsList.add(quest2)


        return questionsList
    }
}
