package grailproj

class Author {
static hasMany=[books:Book]
    String authorName;

    static constraints = {
    }
}
