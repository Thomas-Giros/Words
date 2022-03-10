package com.example.wordsapp

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith






@RunWith(AndroidJUnit4::class)
class NavigationTests {
    lateinit var navController: TestNavHostController

    lateinit var letterListScenario: FragmentScenario<LetterListFragment>


    @Before
    fun setup(){
        navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )

        letterListScenario =  launchFragmentInContainer(themeResId=R.style.Theme_Words)

        letterListScenario.onFragment { fragment ->

            navController.setGraph(R.navigation.nav_graph)

            Navigation.setViewNavController(fragment.requireView(),  navController)
        }
    }


    @Test
    fun navigate_to_words_nav_component0(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }

    @Test
    fun navigate_to_words_nav_component1(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }

    @Test
    fun navigate_to_words_nav_component2(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }

    @Test
    fun navigate_to_words_nav_component3(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(3, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }

    @Test
    fun navigate_to_words_nav_component4(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(4, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }
    @Test
    fun navigate_to_words_nav_component10(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(10, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }
    @Test
    fun navigate_to_words_nav_component15(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(15, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }
    @Test
    fun navigate_to_words_nav_component20(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(20, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }
    @Test
    fun navigate_to_words_nav_component24(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(24, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }
    @Test
    fun navigate_to_words_nav_component25(){
        onView(withId(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(25, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }

}
