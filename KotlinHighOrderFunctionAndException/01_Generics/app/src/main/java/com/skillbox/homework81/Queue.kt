package com.skillbox.homework81

class Queue<T> {
    private val list = emptyList<T>().toMutableList()
    fun enqueue(item: T) = list.add(item)
    fun dequeue() = list.removeFirstOrNull()
}

