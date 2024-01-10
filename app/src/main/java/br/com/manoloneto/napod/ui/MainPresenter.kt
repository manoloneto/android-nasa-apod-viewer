package br.com.manoloneto.napod.ui

import android.util.Log
import br.com.manoloneto.napod.data.NasaRepository
import br.com.manoloneto.napod.data.model.NasaItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MainPresenter(
    private val view: ViewContract,
) : PresenterContract {

    private val scope = CoroutineScope(Job() + Dispatchers.Main)

    override fun init() {
        getNasaItem()
    }

    override fun getNasaItem() {
        scope.launch {
            NasaRepository.getNasaItem(
                onSuccess = { nasaItem ->
                    onSuccess(nasaItem)
                },
                onFailure = { error ->
                    Log.d("NasaRepository.getNasaItem", error)
                }
            )
        }
    }

    private fun onSuccess(nasaItem: NasaItem) {
        view.showImage(nasaItem.url)
    }
}