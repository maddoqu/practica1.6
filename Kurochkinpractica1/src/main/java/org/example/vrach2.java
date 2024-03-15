package org.example;
import java.util.Objects;
public class vrach2 extends Vrach {
        @Override
        public void writeRecipe(String text) {
            super.writeRecipe(text + " и поставить градусник");
        }

}

