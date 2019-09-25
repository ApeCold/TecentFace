import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.iai.v20180301.IaiClient;
import com.tencentcloudapi.iai.v20180301.models.CompareFaceRequest;
import com.tencentcloudapi.iai.v20180301.models.CompareFaceResponse;

public class Main {

    public static void main(String[] args) throws Exception{
        Credential cred = new Credential("AKI………………lzz", "vb4………………yHf");

        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setEndpoint("iai.tencentcloudapi.com");

        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);

        IaiClient client = new IaiClient(cred, "ap-shanghai", clientProfile);

        String params = "{\"UrlA\":\"https://joy.online.sh.cn/images/attachement/jpeg/site1/20170607/IMG0025116bbe5644679952356.jpeg\",\"UrlB\":\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1569300048356&di=d09ed665cd8f67a2ba13c70fbaddb5c7&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn08%2F698%2Fw640h858%2F20180319%2Fff98-fyskeua9472018.jpg\"}";
        CompareFaceRequest req = CompareFaceRequest.fromJsonString(params, CompareFaceRequest.class);

        CompareFaceResponse resp = client.CompareFace(req);

        System.out.println(CompareFaceRequest.toJsonString(resp));
    }
}
