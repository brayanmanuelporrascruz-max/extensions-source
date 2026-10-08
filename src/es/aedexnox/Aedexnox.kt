package eu.kanade.tachiyomi.extension.es.aedexnox

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Aedexnox : Madara(
    "Aedexnox", 
    "https://aedexnox.akan01.com", 
    "es", 
    SimpleDateFormat("MMMM dd, yyyy", Locale("es"))
) {
    override val useNewChapterEndpoint = true
}
