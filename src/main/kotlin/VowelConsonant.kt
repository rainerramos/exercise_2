fun countVowels(phrase: String): Int {
    val VOWELS = "aeiou"
    var totalVowels = 0

    for(letter in phrase){
        if(letter.lowercaseChar() in VOWELS) totalVowels++
    }
    return totalVowels
}

fun countConsonants(phrase: String): Int {
    val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0

    for(letter in phrase){
        if(letter.lowercaseChar() in CONSONANTS) totalConsonants++
    }
    return totalConsonants
}