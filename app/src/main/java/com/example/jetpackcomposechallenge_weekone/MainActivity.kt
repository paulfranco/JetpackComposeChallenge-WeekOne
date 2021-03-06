package com.example.jetpackcomposechallenge_weekone

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposechallenge_weekone.model.PetData
import com.example.jetpackcomposechallenge_weekone.ui.theme.JetpackComposeChallengeWeekOneTheme
import com.example.jetpackcomposechallenge_weekone.uitel.PetCard
import com.example.jetpackcomposechallenge_weekone.viewmodel.PetViewModel

class MainActivity : AppCompatActivity() {

    private val petViewModel: PetViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeChallengeWeekOneTheme {
                val petLists = petViewModel.petsList.value
                SetPetList(petList = petLists!!, context = this)
            }
        }
    }
}

@Composable
fun SetPetList(petList: List<PetData>, context: Context) {
    LazyColumn {
        itemsIndexed(items = petList) { index, itemPet ->
            PetCard(petData = itemPet, onClick = {
                Toast.makeText(context, itemPet.petName, Toast.LENGTH_SHORT ).show()
            })
        }
    }
}


@Preview
@Composable
fun SetPetView() {
    JetpackComposeChallengeWeekOneTheme {

    }
}