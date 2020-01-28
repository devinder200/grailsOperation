package grailproj

class Engine {

    String engineName;
    Car car;
    static belongsTo = [car:Car]
    static constraints = {
    }
}
