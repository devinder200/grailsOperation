package grailproj

class StudentController {

    def studentService

    def index() {
        def students = Student.list()
        [students:students]

    }





}
