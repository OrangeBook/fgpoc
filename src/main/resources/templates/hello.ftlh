<html>
<head>
  <title>Tools</title>
</head>
<br>


<#list workers as name, fields>
<p>Worker ${name}: </p>
    <#list fields as field>
  ${field.getName()} <input type="${field.getType()}" name="${field.getName()}" value="Type here"/></br>
    </#list> </br>

</#list>


</body>
</html>