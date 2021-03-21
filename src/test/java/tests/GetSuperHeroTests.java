package tests;

import model.SuperHero;
import org.junit.jupiter.api.Test;

import java.util.List;

import static steps.SuperHeroSteps.requestGetSuperHeroStep;

public class GetSuperHeroTests {

    @Test
    public void getTest() {
        List<SuperHero> response = requestGetSuperHeroStep(200);
        System.out.println("33333");
        System.out.println("3335555");
    }

//    @Test
//    public void sddfdgsdg(){
//        List<SuperHero> response = requestPostSuperHeroStep(200);
//    }
//}

}
