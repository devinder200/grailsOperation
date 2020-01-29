package grailproj

class PersonController {

    static defaultAction = "list"
    def index() { }

    def list(){

    }

    def add(){

        String uname=params.name;
        String uage = params.age;

        Person person=new Person(name : uname, age: uage)
        person.save()
       // redirect action:"fetch"
        render ("success")


    }

    def fetch(){
       println("inside fetch ")
        def persons= Person.list();
        println(persons)
        [persons:persons]

    }
}
