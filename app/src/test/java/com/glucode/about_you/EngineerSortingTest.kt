package com.glucode.about_you;

import com.glucode.about_you.engineers.models.Engineer
import com.glucode.about_you.mockdata.MockData
import org.junit.Assert.assertEquals
import org.junit.Test

class EngineerSortingTest {

    @Test
    fun testEngineersSortedByYears() {
        val engineers = MockData.engineers.toList()
        val sortedByYears = engineers.sortedBy { it.quickStats.years }

        assertEquals(sortedByYears, engineers.sortedByYears())
    }

    @Test
    fun testEngineersSortedByCoffees() {
        val engineers = MockData.engineers.toList()
        val sortedByCoffees = engineers.sortedBy { it.quickStats.coffees }

        assertEquals(sortedByCoffees, engineers.sortedByCoffees())
    }

    @Test
    fun testEngineersSortedByBugs() {
        val engineers = MockData.engineers.toList()
        val sortedByBugs = engineers.sortedBy { it.quickStats.bugs }

        assertEquals(sortedByBugs, engineers.sortedByBugs())
    }

    private fun List<Engineer>.sortedByYears(): List<Engineer> {
        return this.sortedBy { it.quickStats.years }
    }

    private fun List<Engineer>.sortedByCoffees(): List<Engineer> {
        return this.sortedBy { it.quickStats.coffees }
    }

    private fun List<Engineer>.sortedByBugs(): List<Engineer> {
        return this.sortedBy { it.quickStats.bugs }
    }

}
