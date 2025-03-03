package com.epam.ld.module2.testing.template;

import com.epam.ld.module2.testing.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class TemplateEngineTest {

    @Test
    public void testSystemReplacePlaceholdersWithValuesProvidedAtRuntime() {
        Template template = new Template();
        Client client = new Client();

        TemplateEngine templateEngine = new TemplateEngine();
        String message = templateEngine.generateMessage(template, client);

        fail();
    }
}
