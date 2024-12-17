package ma.emsi.houdaifa.appresthoudaifa;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guide")
public class GuideTouristiqueResource {

    private final LlmClient llmClient = new LlmClient();

    @GET
    @Path("/{lieu}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getInformationsTouristiques(@PathParam("lieu") String lieu) {
        try {
            return llmClient.obtenirInformationsTouristiques(lieu);
        } catch (Exception e) {
            throw new LlmException("Erreur lors de la récupération des informations touristiques.", e);
        }
    }
}

