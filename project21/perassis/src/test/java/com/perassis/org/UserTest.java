package com.perassis.org;

import org.junit.Assert;
import org.junit.Test;


public class UserTest {
    @Test
    public void createUser_useTwoParameterConstructor_ShouldReturnUserWithMatchingValues() throws Exception {

        // Arrange
        User user;

        // Act
        user = new User("Rolando", "passCode");

        // Assert
        Assert.assertEquals(user.getUserName(), "Rolando");
        Assert.assertEquals(user.getPassword(), "passCode");

    }

    @Test
    public void createUser_useFourParameterConstructor_ShouldReturnUserWithMatchingValues() throws Exception {

        // Arrange
        User user;

        // Act
        user = new User("Rolando", "Rivera","astrosFan", "passCode");

        // Assert
        Assert.assertEquals(user.getFirstName(), "Rolando");
        Assert.assertEquals(user.getLastName(), "Rivera");
        Assert.assertEquals(user.getUserName(), "astrosFan");
        Assert.assertEquals(user.getPassword(), "passCode");

    }

}