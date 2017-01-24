package creation;

/**
 * Created by carlosrojasmatas on 1/9/17.
 *
 * Use the builder pattern when the constructor params are too many.
 */
public class Item2 {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbo;

    public static class Builder {
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbo = 0;
        private int sodium = 0;

        public Builder(int servings,int servingSize) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int calories) {
            this.calories =  calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder carbo(int carbo){
            this.carbo = carbo;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Item2 build(){
            return new Item2(this);
        }


    }

    private Item2(Builder builder) {
        this.sodium=builder.sodium;
        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
        this.carbo = builder.carbo;
        this.calories = builder.calories;
        this.fat = builder.fat;

    }

    public static void main(String[] args) {
        Item2 nf = new Item2.Builder(0,0).calories(8).build();
    }
}
