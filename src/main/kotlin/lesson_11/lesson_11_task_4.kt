package org.example.lesson_11

class Ingredient(
    val nameIngredient: String,
    val unitMeasurement: String,
) {}

class Recipe(
    val photo: String,
    val title: String,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
    var ingredientsQuantity: MutableList<Int> = mutableListOf(),
    val cookingMethod: String,
    val numberOfDishes: Int,
) {
    fun calculateQuantity() {
        ingredientsQuantity = ingredientsQuantity.map { it * numberOfDishes }.toMutableList()
    }

    fun addIngredient(ingredient: Ingredient, quantity: Int) {
        ingredients.add(ingredient)
        ingredientsQuantity.add(quantity)
    }

    fun showIngredients() {
        println("Ингредиенты для блюда \"$title\":")
        for (i in 0 until ingredients.size) {
            println("${ingredients[i].nameIngredient} - ${ingredientsQuantity[i]} ${ingredients[i].unitMeasurement}")
        }
    }
}

class RecipeCategory(
    val recipeItem: MutableList<Recipe> = mutableListOf(),
) {
    fun addRecipe(recipe: Recipe) {
        recipeItem.add(recipe)
    }
    fun showRecipeCategory() {
        for (i in 0 until recipeItem.size) {
            println("Фото: ${recipeItem.map { it.photo }[i]}, Заголовок: ${recipeItem.map { it.title }[i]}")
        }
    }
}

fun main() {

    val curd = Ingredient("Творог", "Г")
    val chickenEgg = Ingredient("Куриное яйцо", "Штуки")
    val wheatFlour = Ingredient("Пшеничная мука", "Ст ложек")
    val sunflowerOil = Ingredient("Подсолнечное масло", "Ст ложек")
    val sugar = Ingredient("Сахар", "Ст ложек")

    val burgerWithMushrooms = Recipe(
        "image url",
        "Бургер с грибами и сыром",
        cookingMethod = "1. В глубокой миске смешайте говяжий фарш, лук, чеснок, соль и перец. Разделите фарш на 4 равные части и сформируйте котлеты.\n" +
                "2. Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течение 4-5 минут или до желаемой степени прожарки.\n" +
                "3. В то время как котлеты готовятся, подготовьте булочки. Разрежьте их пополам и обжарьте на сковороде до золотистой корочки.\n" +
                "4. Смазать нижние половинки булочек горчицей и кетчупом, затем положите лист салата, котлету, кольца помидора и закройте верхней половинкой булочки.\n" +
                "5. Подавайте бургеры горячими с картофельными чипсами или картофельным пюре.",
        numberOfDishes = 1,
    )
    val chicken = Recipe(
        "image url",
        "Курица",
        cookingMethod = "Рецепт",
        numberOfDishes = 1,
    )

    val burgers = RecipeCategory()
    burgers.addRecipe(burgerWithMushrooms)
    burgers.addRecipe(chicken)
    burgers.showRecipeCategory()

    burgerWithMushrooms.addIngredient(curd, 1)
    burgerWithMushrooms.addIngredient(chickenEgg, 2)
    burgerWithMushrooms.addIngredient(wheatFlour, 6)
    burgerWithMushrooms.addIngredient(sunflowerOil, 5)
    burgerWithMushrooms.addIngredient(sugar, 2)

    burgerWithMushrooms.calculateQuantity()
    burgerWithMushrooms.showIngredients()

}