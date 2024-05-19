package com.glucode.about_you

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.glucode.about_you.about.views.QuestionCardView
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class QuestionViewTest {

    @Test
    fun testQuestionCardView() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val cardView = QuestionCardView(context)

        assertNotNull(cardView)
        assertNull(cardView.title)
        assertNull(cardView.selection)
    }

    @Test
    fun testTitle() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val questionCardView = QuestionCardView(context)

        val questionTitle = "When do you have the most energy?"
        questionCardView.title = questionTitle
        assertEquals(questionTitle, questionCardView.title)
    }

}