package org.gluu;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HealthResourceTest {

	@Test
	public void testHelloEndpoint() {
		given().when().get("/api/v1/health").then().statusCode(200);
	}

}