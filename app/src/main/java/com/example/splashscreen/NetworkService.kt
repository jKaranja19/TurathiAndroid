package com.example.splashscreen

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

// NetworkService.kt
class NetworkService {
    fun defineWord(word: String): String {

        //push this to local.properties
        val apiKey = "nh1cb9m4yspcmwq687www9qn7j3ix3dmppv7a0ot4mn0bwr3v"
//        YOUR API KEY
        val trimmedWord = word.lowercase().trim()

        val url = URL("https://api.wordnik.com/v4/word.json/$trimmedWord/definitions?limit=200&partOfSpeech=noun&includeRelated=false&sourceDictionaries=wiktionary&useCanonical=false&includeTags=false&api_key=$apiKey")

        val urlConnection = url.openConnection() as HttpURLConnection
        try {
            val inputStream = urlConnection.inputStream
            val reader = BufferedReader(InputStreamReader(inputStream, "UTF-8"))
            val response = StringBuilder()
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                response.append(line).append('\n')
            }
            return parseMeaning(response.toString())
        } finally {
            urlConnection.disconnect()
        }
    }

    private fun parseMeaning(response: String): String {
        // Parse the JSON response and return the meaning
        // Implement your parsing logic here
        return "Meaning not found"
    }
}
