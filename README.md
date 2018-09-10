# Test Suite: Day of the week
The goal of this assignment is to explore the differences between different techniques for finding test cases.

## Functionality to test
You are given the source code for a method dayOfWeek() that, given a date, will identify the day of a week that date falls on. For example, the date 21 July 2011 falls on a Thursday, and the date 21 July 2016 also falls on a Thursday. The implementation will be supplied in the file Dates.java available on Canvas and implements the class dates.Dates , however only the method dayOfWeek is to be tested.

## Specifications
- **Branch coverage**  
Your test class dates.test.BranchTests must maximise the branch coverage for the class dates.Dates. If you do not get 100% coverage, you must explain (in the Javadoc comment for your class) in detail why this is not possible. It is highly recommended that you minimise the number of tests (as defined below) in this class, otherwise you may find that you cannot find adequate tests for the other two test classes.

  *NOTE: EMMA actually provides condition coverage as well as branch coverage, so it is possible to get full branch coverage of   something even though EMMA shows that thing as being yellow.*

- **Data-flow analysis**  
Your test class dates.test.DataflowTest must contain one test that, when combined with the tests in the other two test classes, improves the quality of the test suite, and is based on a particular du-path. You must identify the du-path (that is, the variable, the definition, the use, and the path between definition and use) in a Javadoc comment, and explain why this path is not already tested by the other tests.

- **Equivalence class**  
Your test class dates.test.EquivalenceTest must contain one test that, when combined with the tests in the other two test classes, improves the quality of the test suite, and is a representative of a particular equivalence class. You must describe the equivalence class in a Javadoc comment, and justify why the class is not already tested by the other tests. 
