package grailproj

class Book {


    String title;
    String length;
    static mapping = {
        version false;
    }
    static belongsTo =  [author : Author]
    static constraints = {
    }
}
