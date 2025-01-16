package org.kazak.airtransportation.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Air Transportation System API",
                description = "API системы авиаперевозок на основании демонстрационной базы данных Авиаперевозки от https://postgrespro.ru/",
                version = "1.0.0"
        )
)
public class OpenApiConfig {
}
