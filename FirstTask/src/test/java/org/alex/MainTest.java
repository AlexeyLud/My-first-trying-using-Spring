package org.alex;

import org.alex.server.CreateAndStartServerTest;
import org.alex.validate.LetterValidatorTest;
import org.alex.service.CaseInvertorServiceTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses( {CreateAndStartServerTest.class, CaseInvertorServiceTest.class, LetterValidatorTest.class})
class MainTest extends Main { }