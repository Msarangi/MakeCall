import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;


public class MakeCall {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC8f66f031fd4cc49c090d4a6f93731357";
    public static final String AUTH_TOKEN = "9dc63e1919aa6b1a4854a08328723109";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = "+19167401802";
        String to = "+917978059987";

        Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
                new URI("http://demo.twilio.com/docs/voice.xml")).create();

        System.out.println(call.getSid());
    }
}