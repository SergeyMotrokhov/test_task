package tests;

import model.SuperHero;
import org.junit.jupiter.api.Test;

import java.util.List;

import static steps.SuperHeroSteps.requestGetSuperHeroStep;

public class GetSuperHeroTests {

    @Test
    public void getTest() {
        List<SuperHero> response = requestGetSuperHeroStep(200);
        System.out.println("123");
        System.out.println("123");
    }

//    @Test
//    public void sddfdgsdg(){
//        List<SuperHero> response = requestPostSuperHeroStep(200);
//    }
//}

}
