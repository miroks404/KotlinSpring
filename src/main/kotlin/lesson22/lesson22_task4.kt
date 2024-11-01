package org.example.lesson22

private class MainScreenViewModel {
    fun loadData() {
        val newData1 = MainScreenState("отсутствие данных")

        val newData2 = MainScreenState("загрузка данных")
        newData2.changeLoading(true)

        val newData3 = MainScreenState("наличие загруженных данных")
    }

    data class MainScreenState(
        var data: String = "",
        val isLoading: Boolean = false,
    ) {
        fun changeLoading(isLoading: Boolean) {
            val newMainScreenState = this.copy(isLoading = isLoading)
        }
    }
}

private data class ViewModel(
    val mainScreenState: MainScreenViewModel.MainScreenState,
)




