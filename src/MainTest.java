import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;

import com.google.gson.Gson;

public class MainTest {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String[] hosts = {Constant.HOST_5, Constant.HOST_2, Constant.HOST_3,Constant.HOST_4, Constant.HOST_5,Constant.HOST_6};
        for (int i = 0; i < 1; i++) {
//			String host = Constant.HOST_1;
            String host = hosts[i];
            String token = null;


            System.out.println("-----------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------");
//			ApiTest4 test4 = new ApiTest4(host,token);
            LoginRequest login = new LoginRequest(host);
            token = login.getToken();
            System.out.println(token);


            ApiTest1 test1 = new ApiTest1(host, token);


        }
    }
}

