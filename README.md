# TDD-Calculator
A simple calculator using TDD

# Running the program 

Option 1:
For Linux users
chmod 777 run.sh
sudo ./run.sh

Option 2:
Run the .sh file

Compile the test. On Linux or MacOS
javac -cp .:junit-4.12.jar CalculatorTest.java

and on Windows
javac -cp .;junit-4.12.jar CalculatorTest.java

Run the test from the command line. On Linux or MacOS
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest

and on Windows
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
