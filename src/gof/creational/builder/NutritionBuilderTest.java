package gof.creational.builder;

public class NutritionBuilderTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        NutritionFacts n = new NutritionFacts.Builder().calories(100).servingSize(2).build();

        System.out.println(n);

    }

}
