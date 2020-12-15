package spec;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Spec {
    public static final String URI = "https://superhero.qa-test.csssr.com";
    public static final String BASE_PATH = "/superheroes";
    public static final String USERNAME = "testLogin";
    public static final String PASSWORD = "testPassword";

    public static AuthenticationScheme baseAuth() {
        final PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName(USERNAME);
        authScheme.setPassword(PASSWORD);
        return authScheme;
    }

    public static RequestSpecification getSuperHeroSpecification() {
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(URI)
                .setBasePath(BASE_PATH)
                .setContentType(ContentType.JSON)
                .setAuth(baseAuth())
                .addFilter(new AllureRestAssured())
                .build();
        return requestSpecification;
    }
}
