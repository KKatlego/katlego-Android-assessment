package com.glucode.about_you;

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test

class AppInstrumentedTest {

    @Test
    fun testActivityLaunch() {
        ActivityScenario.launch(MainActivity::class.java).use {
            // Verify that the activity is launched
                onView(withId(R.id.fragment_host)).check(matches(isDisplayed()))
        }
    }
}
