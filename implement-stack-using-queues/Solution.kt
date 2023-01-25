// https://leetcode.com/problems/implement-stack-using-queues

class MyStack() {

    val queue: Queue<Int> = LinkedList<Int>()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop(): Int {
        for (i in 0..(queue.size - 2)) {
            val x = queue.poll()
            queue.add(x)
        }
        return queue.poll()
    }

    fun top(): Int {
        for (i in 0..(queue.size - 2)) {
            val x = queue.poll()
            queue.add(x)
        }
        val top = queue.poll()
        queue.add(top)
        return top
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */