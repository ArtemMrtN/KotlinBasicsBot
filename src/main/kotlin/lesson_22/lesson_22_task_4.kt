package org.example.lesson_22

class MainScreenViewModel {

    var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = MainScreenState(data = "Отсутствие данных", isLoading = false)
        println(mainScreenState.data)

        mainScreenState = mainScreenState.copy(data = "Загрузка данных", isLoading = true)
        println(mainScreenState.data)

        mainScreenState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
        println(mainScreenState.data)
    }

}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)


fun main() {

    val mainScreenState = MainScreenViewModel()
    mainScreenState.loadData()

}