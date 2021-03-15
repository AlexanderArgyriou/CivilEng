import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class MainPage {
    @GET
    public String mainPage() {
        return "index.jsp";
    }
}
