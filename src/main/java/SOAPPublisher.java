import jakarta.xml.ws.Endpoint;
import service.SOAPTeamServiceImpl;


public class SOAPPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8089/ws/team", new SOAPTeamServiceImpl<>());
    }
}
