package grailproj

import sun.awt.X11.XMappingEvent

class Author {
static hasMany=[books:Book]
    String authorName;
    int authorAGe;

    static mapping = {
        version false
    }
    static constraints = {
    }
}
