package com.fullcycle.admin.catalogo.infrastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testApp() {
        assertNotNull(new App());
        App.main(new String[]{});
    }
}