<%-- 
    Document   : index
    Created on : 20-Aug-2022, 8:21:46 AM
    Author     : lynel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Epitome</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <form action="/epitomeDb/" method="POST">
            <table>
                <tr>
                    <td><span>username</span></td><td><input name="uname"/></td>
                </tr>
                <tr>
                    <td><span>Password</span></td><td><input name="pass"/></td>
                </tr>
                <tr>
                    <td><button type="submit">Submit</button></td><td><button type="button" onclick="gotoRegistration()" >New Registeration</button></td>
                </tr>
            </table>
        </form>
        <script>
            function gotoRegistration()
            {
                window.location.href = "/epitomeDb/Registration.html";
            }
            
        </script>
    </body>
</html>
        
