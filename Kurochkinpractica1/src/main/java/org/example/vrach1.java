package org.example;

public class vrach1 extends Vrach{
    @Override
    public void writeRecipe(String text){
        StringBuilder stringBuilder = new StringBuilder(text).reverse();
        System.out.println("Рецет наоборот: "+ stringBuilder);
    }
}
