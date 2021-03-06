package com.example.jetpackcomposechallenge_weekone.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jetpackcomposechallenge_weekone.R
import com.example.jetpackcomposechallenge_weekone.model.PetData

class PetViewModel(): ViewModel() {

    val petsList: MutableLiveData<List<PetData>> by lazy {
        MutableLiveData<List<PetData>>()
    }

    private var petList: ArrayList<PetData>
    init {
        petList = ArrayList()
        getPetList()
    }

    private fun getPetList() {
        fetchList()
        petsList.value = petList
    }

    private fun fetchList() {
        petList.add(PetData(R.drawable.dog1, "JoJo", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog2, "Rocky", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog3, "Ryder", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog4, "Franky", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog5, "Ira", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog6, "Oreo", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog1, "JoJo", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog2, "Rocky", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog3, "Ryder", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog4, "Franky", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog5, "Ira", "Fun and Active Dog ready to be adopted"))
        petList.add(PetData(R.drawable.dog6, "Oreo", "Fun and Active Dog ready to be adopted"))
    }
}