package com.amdocs;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
//@RunWith(Suite.class)
@SuiteClasses({ TestClass2.class, TestRPNCalculator.class })
@IncludeCategory(SmokeTest.class)
public class AllTests {

}
