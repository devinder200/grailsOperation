package grailproj

class Engine {

    String engineName;
    static belongsTo = [car:Car]
    static constraints = {
    }
}
