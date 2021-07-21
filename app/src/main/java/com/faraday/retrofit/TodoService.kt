package com.faraday.retrofit

import retrofit2.http.GET

interface TodoService {
    @GET("todos")
    suspend fun getAllTodos(): List<Todo>
}