// https://leetcode.com/problems/flipping-an-image

class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (i in 0 until image.size) {
            for (j in 0 until image.size / 2) {
                val l = image[i][j]
                val r = image[i][image.size - j - 1]
                image[i][j] = if (r == 0) 1 else 0
                image[i][image.size - j - 1] = if (l == 0) 1 else 0
            }
        }
        if (image.size % 2 == 1) {
            for (i in 0 until image.size) {
                image[i][image.size / 2] = if (image[i][image.size / 2] == 0) 1 else 0
            }
        }
        return image
    }
}