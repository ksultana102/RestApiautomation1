import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTweets {
    protected TweetClient tweetsClient;

@BeforeMethod
public void setUp(){
    this.tweetsClient=new TweetClient();
}

    @Test
    public void testUserCanTweetSuccessfully(){
        String status="Tweeing from the astoria campusssss";
        ValidatableResponse response=this.tweetsClient.sendTweet(status);
        response.statusCode(200);
}
@Test
    public void testUserCannotPostDuplicateTweet(){
        String status=("Tweet");
        ValidatableResponse response=this.tweetsClient.sendTweet(status);
        response.statusCode(200);
        response=this.tweetsClient.sendTweet(status);
      response.statusCode(403);
}
}
