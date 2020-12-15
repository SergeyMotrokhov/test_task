package steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import io.restassured.path.json.JsonPath;
import model.SuperHero;

import java.util.List;

public class JsonMappingStep {

    public static List<SuperHero> convertSuperHeroFromJson(JsonPath respJson){
        List<SuperHero> instances = null;
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory factory = mapper.getTypeFactory();
        CollectionType listType = factory.constructCollectionType(List.class, SuperHero.class);
        try {
            instances = mapper.readValue(respJson.prettify(), listType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return instances;
    }

}
