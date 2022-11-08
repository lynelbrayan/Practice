


<!DOCTYPE html>
<!DOCTYPE html>

<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            String colname=request.getParameter("colname");
            String dept=request.getParameter("dept"); 
            String email=request.getParameter("email");
            String pword=request.getParameter("pword");
            String cpword=request.getParameter("cpword");
            %>
            
            
            <%
                out.print(colname+"\n");
                out.print(dept+"\n");
                out.print(email+"\n");
                out.print(pword+"\n");
                
                %>
            
                
                <button type="button" onclick="APEvent">Add Participants</button>
        <button>Select Events</button>
        <div id="addit">
            <table>
                <tr>
                    <td>name</td><td><input type="name" name="name1"/></td>
                    <td>register number</td><td><input type="name" name="rno1" /></td>
                </tr>
                <div id="newstdspace"></div>
                <tr>
                    <td><button >submit</button></td>
                    <td><button onclick="addStudent" type="button">add students</button>
                </tr>
            </table>
        </div>
        
        <script>
            var i=2;
            
            let counter = 2;
            
            function addStudent()
            {
            if (counter <= 15) {
                let div = document.createElement('div');
                div.innerHTML = "
                                <div id="addit">
            <table>
                <tr>
                    <td>name</td><td><input type="name" name="name${counter}"/></td>
                    <td>register number</td><td><input type="name" name="rno${counter}" /></td>
                </tr>
                <div id="newstdspace"></div>
            </table>
        </div>"

                }
            
         
        }
            </script>
        
    </body>
</html>
