package gof.creational.builder;

public class NutritionFacts {

    private int calories;
    private int servingSize;

    public NutritionFacts(Builder builder) {
        this.calories = builder.calories;
        this.servingSize = builder.servingSize;
    }

    public static class Builder {

        private int calories;
        private int servingSize;

        public Builder calories(int i) {
            this.calories = i;
            return this;
        }

        public Builder servingSize(int i) {
            this.servingSize = i;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }

    @Override
    public String toString() {
        return "NutritionFacts [calories=" + calories + ", servingSize=" + servingSize + "]";
    }


}
