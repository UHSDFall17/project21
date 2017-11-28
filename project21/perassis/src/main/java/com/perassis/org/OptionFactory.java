package com.perassis.org;

public class OptionFactory {

    public Option getOption(String optionType){

        if(optionType == null){
            return null;
        }
        if(optionType.equalsIgnoreCase("SignIn")){
            return new SignIn();
        } else if(optionType.equalsIgnoreCase("LoggIn")){
            return new LoggIn();
        } else if(optionType.equalsIgnoreCase("QuitApp")){
            return new QuitApp();
        } else if(optionType.equalsIgnoreCase("ViewTask")){
            return new ViewTask();
        }
        return null;
    }

}
