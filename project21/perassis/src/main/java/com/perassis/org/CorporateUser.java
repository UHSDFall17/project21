package com.perassis.org;

public class CorporateUser
{

    private String firstName;
    private String lastName;
    private String userName;
    private String companyName;
    private String password;
    private UserCalendar userCalendar;

    public CorporateUser(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    public CorporateUser(String firstName, String lastName, String userName, String companyName, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.companyName = companyName;
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public UserCalendar getUserCalendar()
    {
        return userCalendar;
    }

    public void setUserCalendar(UserCalendar userCalendar)
    {
        this.userCalendar = userCalendar;
    }
}
