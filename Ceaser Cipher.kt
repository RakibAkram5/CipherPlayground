fun main() {

    println("Caesar Cipher Program")
    println("1. Encryption")
    println("2. Decryption")
    print("Choose an option (1 or 2): ")

    val choice = readLine()!!.toInt()

    print("Enter your message: ")
    val message = readLine()!!.lowercase()

    print("Enter shift value: ")
    val shift = readLine()!!.toInt()

    var result = ""

    for (char in message) {

        if (char in 'a'..'z') {

            if (choice == 1) {   // Encryption
                val newChar = ((char - 'a' + shift) % 26 + 'a'.code).toChar()
                result += newChar
            }
            else if (choice == 2) {  // Decryption
                val newChar = ((char - 'a' - shift + 26) % 26 + 'a'.code).toChar()
                result += newChar
            }

        } else {
            result += char
        }
    }

    if (choice == 1) {
        println("Encrypted Message: $result")
    } else if (choice == 2) {
        println("Decrypted Message: $result")
    } else {
        println("Invalid Choice")
    }
}