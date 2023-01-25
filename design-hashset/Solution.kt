// https://leetcode.com/problems/design-hashset

class MyHashSet() {

    val set = BooleanArray(1000001)

    fun add(key: Int) {
        set[key] = true
    }

    fun remove(key: Int) {
        set[key] = false
    }

    fun contains(key: Int): Boolean {
        return set[key]
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */