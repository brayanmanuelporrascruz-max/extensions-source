package eu.kanade.tachiyomi.extension.es.lectortaurus

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import java.text.SimpleDateFormat
import java.util.Locale

class LectorTaurus : MangaThemesia(
    "Lector Taurus", 
    "https://lectortaurus.com", 
    "es", 
    dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale("es"))
)
