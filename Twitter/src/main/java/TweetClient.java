import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class TweetClient {
protected final static String API_KEY="DLbF1u6Np9Q0jwZUEU6HjZxYM";
protected final static String API_SERECT_KEY="hxbueLpRdIMYMtnqUfPKcBvUQ0O65V4jOXdjc35d10gVHkRy7H";
protected final static String ACCESS_TOKEN="1182491294863712256-pugXjCwcAXVICgfrJ2UndxmVJ9dD64";
protected final static String ACCESS_TOKEN_SECRET="dpRyoq3s01caHOe13mdRmcZV324pSB6YA3O5Elj4xqP4a";


    protected final static String BASE_URI = "https://api.twitter.com/1.1";
    protected final static String TWEET_ENDPOINT="/statuses/update.json";
    public ValidatableResponse sendTweet(String status){
        return given().auth()
                .oauth(API_KEY, API_SERECT_KEY ,ACCESS_TOKEN , ACCESS_TOKEN_SECRET )
                .param("status",status)
                .when().post(BASE_URI+TWEET_ENDPOINT)
                .then();

    }

    }

