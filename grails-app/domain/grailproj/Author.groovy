package grailproj

import sun.awt.X11.XMappingEvent

class Author {
static hasMany=[book:Book]
    String authorName;


    static mapping = {
        version false
    }
    static constraints = {
    }
}
