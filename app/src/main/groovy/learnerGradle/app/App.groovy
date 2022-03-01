/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package learnerGradle.app

import learnerGradle.list.LinkedList

import static learnerGradle.utilities.StringUtils.join
import static learnerGradle.utilities.StringUtils.split
import static learnerGradle.app.MessageUtils.getMessage

import org.apache.commons.text.WordUtils

class App {
    static void main(String[] args) {
        LinkedList tokens
        tokens = split(getMessage())
        String result = join(tokens)
        println(WordUtils.capitalize(result))
    }
}
