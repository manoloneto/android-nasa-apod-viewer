package br.com.manoloneto.napod.ui

interface ViewContract {
    fun showImage(image: String)
}

interface PresenterContract
{
    fun init()
    fun getNasaItem()
}