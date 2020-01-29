package grailproj

class Book {


    String title;
    static mapping = {
        version false;
    }
    static belongsTo =  Author
    static constraints = {
    }
}
