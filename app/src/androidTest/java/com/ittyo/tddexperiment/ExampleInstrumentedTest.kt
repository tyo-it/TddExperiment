package com.ittyo.tddexperiment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun userCanTypeFirstName() {
        onView(withId(R.id.firstName)).perform(typeText("John"))
        onView(withId(R.id.firstName)).check(matches(withText("John")))
    }

    @Test
    fun userCanTypeLastName() {
        onView(withId(R.id.lastName)).perform(typeText("Adam"))
        onView(withId(R.id.lastName)).check(matches(withText("Adam")))
    }

    @Test
    fun givenFirstAndLastName_whenUserClickLoginButton_thenShowFullName() {
        onView(withId(R.id.firstName)).perform(typeText("John"), closeSoftKeyboard())
        onView(withId(R.id.lastName)).perform(typeText("Adam"), closeSoftKeyboard())

        onView(withId(R.id.btnLogin)).perform(click())
        onView(withId(R.id.fullName)).check(matches(withText("John Adam")))
    }


}