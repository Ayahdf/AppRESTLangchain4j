package ma.emsi.houdaifa.appresthoudaifa;

import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.service.AiServices;

public class LlmClient {

    private final GuideTouristiqueService service;

    public LlmClient() {
        String apiKey = System.getenv("GEMINI_KEY");
        ChatLanguageModel model = GoogleAiGeminiChatModel.builder()
                .apiKey(apiKey)
                .modelName("gemini-1.5-flash")
                .temperature(0.7)
                .build();

        this.service = AiServices.builder(GuideTouristiqueService.class)
                .chatLanguageModel(model)
                .build();
    }

    public String obtenirInformationsTouristiques(String lieu) {
        return service.getInformationsTouristiques(lieu);
    }
}
