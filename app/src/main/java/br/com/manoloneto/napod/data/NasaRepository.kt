package br.com.manoloneto.napod.data

import br.com.manoloneto.napod.data.model.NasaItem
import br.com.manoloneto.napod.data.network.ApiClient

class NasaRepository() {

    companion object {
        suspend fun getNasaItem(
            onSuccess: (NasaItem) -> Unit,
            onFailure: (String) -> Unit,
        ) {
            try {
                val response = ApiClient.apiService.getNasaItem()
                if (response.isSuccessful) {
                    response.body()?.let {
                        onSuccess(it)
                    }
                } else {
                    onFailure("Error: ${response.code()}")
                }
            } catch (e: Exception) {
                onFailure(e.message ?: "An error occurred")
            }
        }
    }

}