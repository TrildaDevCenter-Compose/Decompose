package com.arkivanov.decompose.extensions.compose.jetbrains

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.arkivanov.decompose.value.Value

@Deprecated("Please use Value.subscribeAsState() extension function", ReplaceWith("subscribeAsState()"))
@Composable
fun <T : Any> Value<T>.asState(): State<T> = subscribeAsState()
