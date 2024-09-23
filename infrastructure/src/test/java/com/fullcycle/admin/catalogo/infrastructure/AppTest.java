package com.fullcycle.admin.catalogo.infrastructure;

import org.junit.jupiter.api.Test;
import org.springframework.core.env.AbstractEnvironment;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testApp() {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "test");
        assertNotNull(new App());
        App.main(new String[]{});
    }
}