fun main() {

    println("Vigenere Cipher Program")
    println("1. Encryption")
    println("2. Decryption")
    print("Choose option (1 or 2): ")
    val choice = readLine()!!.toInt()

    print("Enter message: ")
    val message = readLine()!!.lowercase()

    print("Enter key: ")
    val key = readLine()!!.lowercase()

    var result = ""
    var keyIndex = 0

    for (char in message) {

        if (char in 'a'..'z') {

            val keyChar = key[keyIndex % key.length]
            val shift = keyChar - 'a'

            if (choice == 1) {   // Encryption
                val newChar = ((char - 'a' + shift) % 26 + 'a'.code).toChar()
                result += newChar
            }
            else if (choice == 2) {   // Decryption
                val newChar = ((char - 'a' - shift + 26) % 26 + 'a'.code).toChar()
                result += newChar
            }

            keyIndex++
        }
        else {
            result += char
        }
    }

    if (choice == 1)
        println("Encrypted Message: $result")
    else if (choice == 2)
        println("Decrypted Message: $result")
    else
        println("Invalid Option")
}