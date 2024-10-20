package utils;

import pages.AddEmpPage;

public class pageInitializer {

    public static AddEmpPage addEmpPage;

    public static void initializePageObject(){
        addEmpPage = new AddEmpPage();
    }
}
