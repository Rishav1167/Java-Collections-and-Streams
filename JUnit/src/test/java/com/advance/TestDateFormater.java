package com.advance;

import com.advance.date_formatter.DateFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDateFormater {
    private DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    void testFormatDate(){
        Assertions.assertEquals("10-01-2001", dateFormatter.formatDate("2001-01-10"));
    }
}
