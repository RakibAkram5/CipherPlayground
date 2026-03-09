fun main() {

    println("Autokey Cipher Program")
    println("1. Encryption")
    println("2. Decryption")
    print("Choose option (1 or 2): ")
    val choice = readLine()!!.toInt()

    print("Enter message: ")
    val message = readLine()!!.lowercase()

    print("Enter key: ")
    val key = readLine()!!.lowercase()

    var result = ""

    if (choice == 1) {  // Encryption

        val newKey = key + message   // key + plaintext

        for (i in message.indices) {
            val m = message[i]
            if (m in 'a'..'z') {
                val shift = newKey[i] - 'a'
                val newChar = ((m - 'a' + shift) % 26 + 'a'.code).toChar()
                result += newChar
            } else {
                result += m
            }
        }

        println("Encrypted Message: $result")
    }

    else if (choice == 2) {  // Decryption

        var newKey = key

        for (i in message.indices) {
            val c = message[i]
            if (c in 'a'..'z') {
                val shift = newKey[i] - 'a'
                val newChar = ((c - 'a' - shift + 26) % 26 + 'a'.code).toChar()
                result += newChar
                newKey += newChar
            } else {
                result += c
            }
        }

        println("Decrypted Message: $result")
    }

    else {
        println("Invalid Option")
    }
}