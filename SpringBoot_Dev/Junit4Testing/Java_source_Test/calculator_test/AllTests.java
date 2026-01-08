package calculator_test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Categories.class)

//@IncludeCategory(Dev.class)
@RunWith(Suite.class)
@SuiteClasses({ Addtion_test.class })
public class AllTests {

}
