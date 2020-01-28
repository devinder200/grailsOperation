package grailproj

class Author {
static hasmany=[book:Book]
    String authorName;

    static constraints = {
    }
}
