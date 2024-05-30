package CodeSmells_lab_6.Part_5.FormTemplateMethod;

public class PastaRecipe extends CookingRecipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding pasta");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }
}