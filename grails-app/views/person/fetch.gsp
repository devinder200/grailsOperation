<!doctype html>
<html>
<head>

    <title>Welcome to Devinder</title>
</head>
<body>
Welcome to Fetch.gsp ! Devinder
<g:each in="${persons}" var="person">
    <p>${person.name}</p>
    <p>${person.age}</p>
</g:each>




</body>
</html>
