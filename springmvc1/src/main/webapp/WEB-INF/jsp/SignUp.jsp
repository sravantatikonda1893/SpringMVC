<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>Signup Form</head>
<body>
<style type="text/css">
.error
{
color:red; 
font-size:16px;
font-style: italic;
text-shadow: green;

}

<!--Spring Form Tag Library-->
<!--modelAttribute attribute is for the spring to populate into a bean if the user details are already their in that customer model to use in edit option of a form. 
This is got to this page from CustomerController where DS internally sets this ViewName and customer model in request scope using request.getAttribute(). 
And now it calls the setters to set the details in the customer bean for using it in SignUpController(2nd method)
(View Page Source after page is loaded)-->

</style>

<sf:form action="/springmvc/customer/add" method="post" modelAttribute="customer"></br>

<!-- It will display the errors for all the fileds
<sf:errors path="*" cssClass="error"/><br/>-->

<!--will display the errors for only the field specified -->
<sf:errors path="firstname" cssClass="error"/>
FirstName:<sf:input path="firstname"/><br/>

<sf:errors path="lastname" cssClass="error"/>
LastName:<sf:input path="lastname"/> <br/>   
City:<sf:input path="city"/><br/>
State:<sf:input path="state"/><br/>
ZipCode:<sf:input path="zipcode"/><br/>
<input type="submit" value="Add Customer">
</sf:form>

</body>

</html>