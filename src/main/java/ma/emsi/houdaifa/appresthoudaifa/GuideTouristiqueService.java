package ma.emsi.houdaifa.appresthoudaifa;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface GuideTouristiqueService {

    @SystemMessage("""
        Vous êtes un guide touristique. Répondez uniquement en JSON avec ce format exact :
        {
          "ville_ou_pays": "nom de la ville ou du pays",
          "endroits_a_visiter": ["endroit 1", "endroit 2"],
          "prix_moyen_repas": "<prix> <devise du pays>"
        }
        Donnez les 2 principaux endroits à visiter et le prix moyen d'un repas dans la devise locale.
    """)
    String getInformationsTouristiques(@UserMessage String lieu);


}
