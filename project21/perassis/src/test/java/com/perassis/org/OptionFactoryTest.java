package com.perassis.org;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OptionFactoryTest {

    @Test
    public void getOption_passSignInString_ShouldReturnSignInOptionObject() throws Exception {

        // Arrange
        OptionFactory optionFactory = new OptionFactory();
        Option fromFactory;

        // Act
        fromFactory = optionFactory.getOption("SignIn");

        // Assert
        Assert.assertTrue(fromFactory instanceof SignIn);
    }

    @Test
    public void getOption_passLoggInString_ShouldReturnLoggInObject() throws Exception {

        // Arrange
        OptionFactory optionFactory = new OptionFactory();
        Option fromFactory;

        // Act
        fromFactory = optionFactory.getOption("LoggIn");

        // Assert
        Assert.assertTrue(fromFactory instanceof LoggIn);
    }

    @Test
    public void getOption_passQuitAppString_ShouldReturnQuitAppObject() throws Exception {

        // Arrange
        OptionFactory optionFactory = new OptionFactory();
        Option fromFactory;

        // Act
        fromFactory = optionFactory.getOption("QuitApp");

        // Assert
        Assert.assertTrue(fromFactory instanceof QuitApp);
    }

    @Test
    public void getOption_passViewTaskString_ShouldReturnViewTaskObject() throws Exception {

        // Arrange
        OptionFactory optionFactory = new OptionFactory();
        Option fromFactory;

        // Act
        fromFactory = optionFactory.getOption("ViewTask");

        // Assert
        Assert.assertTrue(fromFactory instanceof ViewTask);
    }

    @Test
    public void getOption_passIncorrectString_ShouldReturnNullObject() throws Exception {

        // Arrange
        OptionFactory optionFactory = new OptionFactory();
        Option fromFactory;

        // Act
        fromFactory = optionFactory.getOption("MatchesNone");

        // Assert
        Assert.assertEquals(null, fromFactory);
    }

}