package com.example.profilescreenwithcompose.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ProfileViewModel : ViewModel() {

    private val _state = MutableStateFlow(
        ProfileUIState()
    )
    val state = _state.asStateFlow()

    fun setFirstName(text : String){
        _state.update {
            it.copy(
                firstName = text
            )
        }
    }
    fun setLastName(text : String){
        _state.update {
            it.copy(
                lastName = text
            )
        }
    }
    fun setLocation(text : String){
        _state.update {
            it.copy(
                location = text
            )
        }
    }
    fun setEmail(text : String){
        _state.update {
            it.copy(
                email = text
            )
        }
    }
    fun setPhoneNumber(text : String){
        _state.update {
            it.copy(
                phoneNumber = text
            )
        }
    }

}