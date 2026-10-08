package eu.kanade.tachiyomi.extension.es.imperiomanhwa

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ImperioManhwa : Madara(
    "Imperio Manhwa", 
    "https://imperiomanhua.com", 
    "es", 
    SimpleDateFormat("MMMM dd, yyyy", Locale("es"))
) {
    override val useNewChapterEndpoint = true
}
