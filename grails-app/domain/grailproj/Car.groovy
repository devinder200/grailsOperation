package grailproj

class Car {

    String carModel;
    Engine engine;
    static constraints = {
        engine unique:true
    }
}
