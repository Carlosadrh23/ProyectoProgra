package models;

public class IngredientsInDish {
    private String ingredientId;
    private double quantity;
    private String unit;
    private double cost;

    // Getters y Setters
    public String getIngredientId() { return ingredientId; }
    public void setIngredientId(String ingredientId) { this.ingredientId = ingredientId; }

    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
}
