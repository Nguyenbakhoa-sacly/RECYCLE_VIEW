package category;

import java.util.List;

import food.FOOD;

public class Category {

    private String nameCategory;
    private List<FOOD> foods;

    public Category(String nameCategory, List<FOOD> foods) {
        this.nameCategory = nameCategory;
        this.foods = foods;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<FOOD> getFoods() {
        return foods;
    }

    public void setFoods(List<FOOD> foods) {
        this.foods = foods;
    }
}
