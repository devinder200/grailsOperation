package grailproj

import com.mycompany.myapp.Role
import com.mycompany.myapp.User
import com.mycompany.myapp.UserRole

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

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        def userRole = new Role(authority: 'ROLE_USER').save()

        def testUser = new User(username: 'tester', password: 'pass').save()
        def testAdmin = new User(username: 'admin', password: 'password').save()

        UserRole.create testAdmin, adminRole
        UserRole.create testUser, userRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }

    }
    def destroy = {
    }
}
