package grailproj

class Car {

    String carModel;
    static hasOne = [engine:Engine]
    static constraints = {
        engine unique:true
    }
}
