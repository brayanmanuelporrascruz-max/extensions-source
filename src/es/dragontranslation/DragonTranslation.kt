package eu.kanade.tachiyomi.extension.es.dragontranslation

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class DragonTranslation : Madara(
    "DragonTranslation", 
    "https://dragontranslation.org", 
    "es", 
    SimpleDateFormat("MMMM dd, yyyy", Locale("es"))
) {
    override val useNewChapterEndpoint = true
}
