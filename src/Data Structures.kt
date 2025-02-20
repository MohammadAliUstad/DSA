class Queue<T> {
    private val items: MutableList<T> = mutableListOf()

    fun enqueue(item: T) {
        items.add(item)
    }

    fun dequeue(): T? {
        if (isEmpty()) {
            return null
        }
        return items.removeAt(0)
    }

    fun peek(): T? {
        if (isEmpty()) {
            return null
        }
        return items[0]
    }

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun size(): Int {
        return items.size
    }

    fun clear() {
        items.clear()
    }
}

class Stack<T> {
    private val elements = mutableListOf<T>()

    fun push(element: T) {
        elements.add(element)
    }

    fun pop(): T? {
        if (elements.isNotEmpty()) {
            return elements.removeAt(elements.size - 1)
        } else {
            return null
        }
    }

    fun peek(): T? {
        return elements.lastOrNull()
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun size(): Int {
        return elements.size
    }
}

fun main() {

}