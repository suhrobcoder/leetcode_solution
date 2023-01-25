// https://leetcode.com/problems/implement-queue-using-stacks

class MyQueue() {

    val stack = ArrayDeque<Int>()
    val tempStack = ArrayDeque<Int>()

    fun push(x: Int) {
        stack.push(x)
    }

    fun pop(): Int {
        for (i in 0 until stack.size) {
            val x = stack.pop()
            tempStack.push(x)
        }
        val top = tempStack.pop()
        for (i in 0 until tempStack.size) {
            val x = tempStack.pop()
            stack.push(x)
        }
        return top
    }

    fun peek(): Int {
        for (i in 0 until stack.size) {
            val x = stack.pop()
            tempStack.push(x)
        }
        val top = tempStack.peek()
        for (i in 0 until tempStack.size) {
            val x = tempStack.pop()
            stack.push(x)
        }
        return top
    }

    fun empty(): Boolean {
        return stack.isEmpty()
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */