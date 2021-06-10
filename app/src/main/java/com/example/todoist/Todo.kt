package com.example.todoist

data class Todo (
    val title: String,
    var isChecked: Boolean = false
)