package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void isPasswordEqual() {
        String dbPassword = "yeah";
        String password = "yeah";
        UserUtils pass_equal = new UserUtils();
        assertTrue(pass_equal.isPasswordEqual(dbPassword, password));


    }

}
