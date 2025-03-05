package com.epam.ld.module2.testing.template;

import com.epam.ld.module2.testing.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateEngineTest {

    @Test
    public void testSystemReplacePlaceholdersWithValuesProvidedAtRuntime() {
        Template template = new Template();
        template.setMessage("Hello #{subject}! Hope you are doing good");
        Client client = new Client();
        client.setAddresses("Manohar");
        TemplateEngine templateEngine = new TemplateEngine();
        String message = templateEngine.generateMessage(template, client);
        String expected = "Hello Manohar! Hope you are doing good";

        assertEquals(expected, message);
    }
}
