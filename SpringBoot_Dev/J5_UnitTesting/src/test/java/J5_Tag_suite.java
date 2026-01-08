import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.J5.Calculator_Test.calculator_test;

/*@SelectPackages("com.J5.Calculator_Test")
@IncludeTags("dev")*/
@Suite
@SelectClasses({calculator_test.class})
@IncludeTags(value = { "Qa" })
public class J5_Tag_suite {
	
}
