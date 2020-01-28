<!DOCTYPE html>
<html>
<head>

    <title>Students</title>
</head>
<body>
<g:each in="${students}" var="student" status="i">
    <h3>${i+1}. ${student.name}, ${student.rollno}</h3>
    <p>

    </p>
    <br/>
</g:each>
</body>
</html>