package grailproj

class BootStrap {

    def init = { servletContext ->
        if (Student.count() == 0) {
            new Student(name: 'John', rollno: '3').save()
            new Student(name: 'Jane', rollno: '33').save()
            new Student(name: 'Scott', rollno: '43').save()
        }
        if (Book.count() == 0) {
            new Book(title: 'book 1 title').save()

        }
    }
    def destroy = {
    }
}
