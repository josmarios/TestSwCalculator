package br.ufal.ic.teste.calc;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CalcTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestCase01.class);
		suite.addTestSuite(TestCase02.class);
		suite.addTestSuite(TestCase03.class);
		suite.addTestSuite(TestCase04.class);
		suite.addTestSuite(TestCase05.class);
		suite.addTestSuite(TestCase06.class);
		suite.addTestSuite(TestCase07.class);
		suite.addTestSuite(TestCase08.class);
		suite.addTestSuite(TestCase09.class);
		suite.addTestSuite(TestCase10.class);
		suite.addTestSuite(TestCase11.class);
		suite.addTestSuite(TestCase12.class);
		suite.addTestSuite(TestCase13.class);
		suite.addTestSuite(TestCase14.class);
		suite.addTestSuite(TestCase15.class);
		suite.addTestSuite(TestCase16.class);
		suite.addTestSuite(TestCase17.class);

		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}