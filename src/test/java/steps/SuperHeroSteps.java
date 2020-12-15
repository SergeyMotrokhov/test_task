package steps;

import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import model.SuperHero;
import org.json.JSONObject;
import tests.Collect;

import javax.management.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static spec.Spec.getSuperHeroSpecification;
import static steps.JsonMappingStep.convertSuperHeroFromJson;

public class SuperHeroSteps {
    public static final String ID = "id";
    public static final String FULLNAME = "fullName";
    public static final String BIRTHDATE = "birthDate";
    public static final String CITY = "city";
    public static final String MAINSKILL = "mainSkill";
    public static final String GENDER = "gender";
    public static final String PHONE = "phone";

    @Step("Вызов метода 'Get all superheroes'")
    public static List<SuperHero> requestGetSuperHeroStep(int statusCode) {
        JsonPath extract = new JsonPath(given()
                .spec(getSuperHeroSpecification())
                .when()
                .get("")
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract().asString());
        return convertSuperHeroFromJson(extract);
    }

    @Step("Вызов метода 'Get all superheroes'")
    public static List<SuperHero> requestGedddtSuperHeroStep(int statusCode, Map<String, String> map) {
        JsonPath extract = new JsonPath(given()
                .queryParams(map)
                .spec(getSuperHeroSpecification())
                .when()
                .get("")
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract().asString());
        return convertSuperHeroFromJson(extract);
    }

    @Step("Вызов метода 'Get all superheroes'")
    public static List<SuperHero> requesfsdgsgtGedddtSuperHeroStep(int statusCode, Map<String, String> map) {
        final String methodName = new StringBuilder()
                .append("")
                .toString();
        JsonPath extract = new JsonPath(given()
                .queryParams(map)
                .spec(getSuperHeroSpecification())
                .when()
                .get(methodName)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract().asString());
        return convertSuperHeroFromJson(extract);
    }

    @Step("Вызов метода 'POST all superheroes'")
    public static List<SuperHero> requestPostSuperHeroStep(int statusCode) {
        JsonPath extract = new JsonPath(given()
                .spec(getSuperHeroSpecification())
                .body(bodyObject().toString())
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract().asString());
        return convertSuperHeroFromJson(extract);
    }

    public static Map<String, String> mapQuery(String id, String fullName, String birthDate, String city,
                                               String mainskill, String gender, String phone) {
        Map<String, String> map = new HashMap<>();
        map.put(ID, id);
        map.put(FULLNAME, fullName);
        map.put(BIRTHDATE, birthDate);
        map.put(CITY, city);
        map.put(MAINSKILL, mainskill);
        map.put(GENDER, gender);
        map.put(PHONE, phone);
        return map;
    }

//    public static JSONObject bodyObject(String id, String fullName, String birthDate, String city,
//                                        String mainskill, String gender, String phone) {
//        JSONObject body = new JSONObject();
//        body.put(ID, id);
//        body.put(FULLNAME, fullName);
//        body.put(BIRTHDATE, birthDate);
//        body.put(CITY, city);
//        body.put(MAINSKILL, mainskill);
//        body.put(GENDER, gender);
//        body.put(PHONE, phone);
//        return body;
//    }

    public static JSONObject bodyObject() {
        JSONObject body = new JSONObject();
        body.put(ID, "345");
        body.put(FULLNAME, "TTTT");
        body.put(BIRTHDATE, "2019-02-21");
        body.put(CITY, "London");
        body.put(MAINSKILL, "magic");
        body.put(GENDER, "M");
        body.put(PHONE, "334737347374");
        return body;
    }
}
