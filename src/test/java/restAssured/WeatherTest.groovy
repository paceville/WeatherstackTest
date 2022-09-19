package restAssured

import io.qameta.allure.Description
import io.qameta.allure.Story
import io.restassured.RestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.builder.ResponseSpecBuilder
import io.restassured.filter.log.LogDetail
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification
import io.restassured.specification.ResponseSpecification
import org.hamcrest.Matchers
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

public class WeatherTest {

    private RequestSpecification requestSpecification;
    private ResponseSpecification responseSpecification;

    private static final String accessToken = "d14309dd5d068e87adde33ec6d7f5897";

    @BeforeAll
    public void setUp() {
        RestAssured.baseURI = "http://api.weatherstack.com/current";

        requestSpecification = new RequestSpecBuilder()
            .log(LogDetail.ALL)
            .setContentType(ContentType.JSON)
            .setBaseUri("http://api.weatherstack.com/current")
            .build();

        responseSpecification = new ResponseSpecBuilder()
            .log(LogDetail.ALL)
            .expectContentType(ContentType.JSON)
            .build()
    }

    @Test
    @Story("Positive check of the current weather in New York")
    public void getCurrentWeatherInNewYorkPositiveTest() {

        RestAssured
            .given()
            .when()
            .get("http://api.weatherstack.com/current?access_key=d14309dd5d068e87adde33ec6d7f5897&query=New%20York")
            .then()
            .spec(responseSpecification)
            .statusCode(200)
            .body("request.type", Matchers.equalTo("City"))
            .body("request.query", Matchers.equalTo("New York, United States of America"))
            .body("request.language", Matchers.equalTo("en"))
            .body("request.unit", Matchers.equalTo("m"))
            .body("location.name", Matchers.equalTo("New York"))
            .body("location.country", Matchers.equalTo("United States of America"))
            .body("location.region", Matchers.equalTo("New York"))
            .body("location.lat", Matchers.notNullValue())
            .body("location.lon", Matchers.notNullValue())
            .body("location.timezone_id", Matchers.equalTo("America/New_York"))
            .body("location.localtime", Matchers.notNullValue())
            .body("location.localtime_epoch", Matchers.notNullValue())
            .body("location.utc_offset", Matchers.equalTo("-4.0"))
            .body("current.observation_time", Matchers.notNullValue())
            .body("current.temperature", Matchers.notNullValue())
            .body("current.weather_code", Matchers.notNullValue())
            .body("current.weather_icons", Matchers.notNullValue())
            .body("current.weather_descriptions", Matchers.notNullValue())
            .body("current.wind_speed", Matchers.notNullValue())
            .body("current.wind_degree", Matchers.notNullValue())
            .body("current.wind_dir", Matchers.notNullValue())
            .body("current.pressure", Matchers.notNullValue())
            .body("current.precip", Matchers.notNullValue())
            .body("current.humidity", Matchers.notNullValue())
            .body("current.cloudcover", Matchers.notNullValue())
            .body("current.feelslike", Matchers.notNullValue())
            .body("current.uv_index", Matchers.notNullValue())
            .body("current.visibility", Matchers.notNullValue())
            .body("current.is_day", Matchers.notNullValue())
    }

    @Test
    @Story("Positive check of the current weather in Paris")
    public void getCurrentWeatherInParisPositiveTest() {

        RestAssured
                .given()
                .when()
                .get("http://api.weatherstack.com/current?access_key=d14309dd5d068e87adde33ec6d7f5897&query=Paris")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("request.type", Matchers.equalTo("City"))
                .body("request.query", Matchers.equalTo("Paris, France"))
                .body("request.language", Matchers.equalTo("en"))
                .body("request.unit", Matchers.equalTo("m"))
                .body("location.name", Matchers.equalTo("Paris"))
                .body("location.country", Matchers.equalTo("France"))
                .body("location.region", Matchers.equalTo("Ile-de-France"))
                .body("location.lat", Matchers.notNullValue())
                .body("location.lon", Matchers.notNullValue())
                .body("location.timezone_id", Matchers.equalTo("Europe/Paris"))
                .body("location.localtime", Matchers.notNullValue())
                .body("location.localtime_epoch", Matchers.notNullValue())
                .body("location.utc_offset", Matchers.equalTo("2.0"))
                .body("current.observation_time", Matchers.notNullValue())
                .body("current.temperature", Matchers.notNullValue())
                .body("current.weather_code", Matchers.notNullValue())
                .body("current.weather_icons", Matchers.notNullValue())
                .body("current.weather_descriptions", Matchers.notNullValue())
                .body("current.wind_speed", Matchers.notNullValue())
                .body("current.wind_degree", Matchers.notNullValue())
                .body("current.wind_dir", Matchers.notNullValue())
                .body("current.pressure", Matchers.notNullValue())
                .body("current.precip", Matchers.notNullValue())
                .body("current.humidity", Matchers.notNullValue())
                .body("current.cloudcover", Matchers.notNullValue())
                .body("current.feelslike", Matchers.notNullValue())
                .body("current.uv_index", Matchers.notNullValue())
                .body("current.visibility", Matchers.notNullValue())
                .body("current.is_day", Matchers.notNullValue())
    }

    @Test
    @Story("Positive check of the current weather in Berlin")
    public void getCurrentWeatherInBerlinPositiveTest() {

        RestAssured
                .given()
                .when()
                .get("http://api.weatherstack.com/current?access_key=d14309dd5d068e87adde33ec6d7f5897&query=Berlin")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("request.type", Matchers.equalTo("City"))
                .body("request.query", Matchers.equalTo("Berlin, Germany"))
                .body("request.language", Matchers.equalTo("en"))
                .body("request.unit", Matchers.equalTo("m"))
                .body("location.name", Matchers.equalTo("Berlin"))
                .body("location.country", Matchers.equalTo("Germany"))
                .body("location.region", Matchers.equalTo("Berlin"))
                .body("location.lat", Matchers.notNullValue())
                .body("location.lon", Matchers.notNullValue())
                .body("location.timezone_id", Matchers.equalTo("Europe/Berlin"))
                .body("location.localtime", Matchers.notNullValue())
                .body("location.localtime_epoch", Matchers.notNullValue())
                .body("location.utc_offset", Matchers.equalTo("2.0"))
                .body("current.observation_time", Matchers.notNullValue())
                .body("current.temperature", Matchers.notNullValue())
                .body("current.weather_code", Matchers.notNullValue())
                .body("current.weather_icons", Matchers.notNullValue())
                .body("current.weather_descriptions", Matchers.notNullValue())
                .body("current.wind_speed", Matchers.notNullValue())
                .body("current.wind_degree", Matchers.notNullValue())
                .body("current.wind_dir", Matchers.notNullValue())
                .body("current.pressure", Matchers.notNullValue())
                .body("current.precip", Matchers.notNullValue())
                .body("current.humidity", Matchers.notNullValue())
                .body("current.cloudcover", Matchers.notNullValue())
                .body("current.feelslike", Matchers.notNullValue())
                .body("current.uv_index", Matchers.notNullValue())
                .body("current.visibility", Matchers.notNullValue())
                .body("current.is_day", Matchers.notNullValue())
    }

    @Test
    @Story("Positive check of the current weather in London")
    public void getCurrentWeatherInLondonPositiveTest() {

        RestAssured
                .given()
                .when()
                .get("http://api.weatherstack.com/current?access_key=d14309dd5d068e87adde33ec6d7f5897&query=London")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("request.type", Matchers.equalTo("City"))
                .body("request.query", Matchers.equalTo("London, United Kingdom"))
                .body("request.language", Matchers.equalTo("en"))
                .body("request.unit", Matchers.equalTo("m"))
                .body("location.name", Matchers.equalTo("London"))
                .body("location.country", Matchers.equalTo("United Kingdom"))
                .body("location.region", Matchers.equalTo("City of London, Greater London"))
                .body("location.lat", Matchers.notNullValue())
                .body("location.lon", Matchers.notNullValue())
                .body("location.timezone_id", Matchers.equalTo("Europe/London"))
                .body("location.localtime", Matchers.notNullValue())
                .body("location.localtime_epoch", Matchers.notNullValue())
                .body("location.utc_offset", Matchers.equalTo("1.0"))
                .body("current.observation_time", Matchers.notNullValue())
                .body("current.temperature", Matchers.notNullValue())
                .body("current.weather_code", Matchers.notNullValue())
                .body("current.weather_icons", Matchers.notNullValue())
                .body("current.weather_descriptions", Matchers.notNullValue())
                .body("current.wind_speed", Matchers.notNullValue())
                .body("current.wind_degree", Matchers.notNullValue())
                .body("current.wind_dir", Matchers.notNullValue())
                .body("current.pressure", Matchers.notNullValue())
                .body("current.precip", Matchers.notNullValue())
                .body("current.humidity", Matchers.notNullValue())
                .body("current.cloudcover", Matchers.notNullValue())
                .body("current.feelslike", Matchers.notNullValue())
                .body("current.uv_index", Matchers.notNullValue())
                .body("current.visibility", Matchers.notNullValue())
                .body("current.is_day", Matchers.notNullValue())
    }

    @Test
    @Description("New York historical weather check: invalid subscription plan")
    public void getHistoricalWeatherInTorontoInvalidSubscriptionPlanNegativeTest() {
        RestAssured
                .given()
                .when()
                .get("http://api.weatherstack.com/historical?access_key=d14309dd5d068e87adde33ec6d7f5897&query=Toronto&historical_date2017-08-22&hourly1")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("error.code", Matchers.equalTo(603))
                .body("error.type", Matchers.equalTo("historical_queries_not_supported_on_plan"))
                .body("error.info",
                        Matchers.equalTo("Your current subscription plan does not support historical weather data. " +
                                "Please upgrade your account to use this feature."))
    }

    @Test
    @Story("Toronto historical weather check: invalid access key")
    public void getHistoricalWeatherInTorontoInvalidAccessKeyNegativeTest() {
        RestAssured
                .given()
                .when()
                .get("http://api.weatherstack.com/historical?access_key=o14309dd5d068e87adde33ec6d7f5897&query=Toronto&historical_date2017-08-22&hourly1")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("error.code", Matchers.equalTo(101))
                .body("error.type", Matchers.equalTo("invalid_access_key"))
                .body("error.info", Matchers.equalTo("You have not supplied a valid API Access Key. [Technical Support: support@apilayer.com]"))
    }

    @Test
    @Story("New York historical weather check: HTTP access restricted")
    public void getHistoricalWeatherInTorontoHTTPSAccessRestrictedNegativeTest() {
        RestAssured
                .given()
                .when()
                .get("https://api.weatherstack.com/historical?access_key=d14309dd5d068e87adde33ec6d7f5897&query=Toronto&historical_date2017-08-22&hourly1")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("error.code", Matchers.equalTo(105))
                .body("error.type", Matchers.equalTo("https_access_restricted"))
                .body("error.info", Matchers.equalTo("Access Restricted - Your current Subscription Plan does not support HTTPS Encryption."))
    }

    @Test
    @Description("New York forecast days check: missing query")
    public void getForecastDaysInTorontoMissingQueryNegativeTest() {
        RestAssured
                .given()
                .when()
                .get("http://api.weatherstack.com/forecast?access_key=d14309dd5d068e87adde33ec6d7f5897&forecast_days1&hourly1")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("error.code", Matchers.equalTo(601))
                .body("error.type", Matchers.equalTo("missing_query"))
                .body("error.info", Matchers.equalTo("Please specify a valid location identifier using the query parameter."))
    }
}
