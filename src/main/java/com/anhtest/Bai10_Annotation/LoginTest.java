package com.anhtest.Bai10_Annotation;

import com.anhtest.common.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LoginSuccess(){
        driver.get("https://www.google.com.vn/?hl=vi");
    }

}
