package com.jms.suite;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Card Shuffler Test Suite")
@SelectPackages({"com.jms.ui","com.jms.card"})
public class TestSuite {

}
