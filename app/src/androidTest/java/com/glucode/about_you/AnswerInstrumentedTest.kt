package com.glucode.about_you


import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.glucode.about_you.about.views.AnswerCardView
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class AnswerViewTest {

    @Test
    fun testAnswerCardView() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val answerCardView = AnswerCardView(context)

        assertNotNull(answerCardView)
        assertNull(answerCardView.title)
    }

    @Test
    fun testSelectedState() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val answerCardView = AnswerCardView(context)

        assertFalse(answerCardView.isSelected)
        answerCardView.setSelected(true)
        assertTrue(answerCardView.isSelected)
    }

    @Test
    fun testSelectedAnswer() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val answerCardView = AnswerCardView(context)

        val answer = "6am"
        answerCardView.title = answer
        assertEquals(answer, answerCardView.title)
    }
}