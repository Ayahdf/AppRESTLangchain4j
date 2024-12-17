package ma.emsi.houdaifa.appresthoudaifa;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guide")
public class GuideTouristiquResource {

    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getLieu(@PathParam("ville_ou_pays") String lieu) {
        // Retourne simplement la valeur du paramètre pour test
        return "{ \"message\": \"Le lieu demandé est : " + lieu + "\" }";
    }
}